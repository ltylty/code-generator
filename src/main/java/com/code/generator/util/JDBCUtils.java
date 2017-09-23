package com.code.generator.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public final class JDBCUtils {

    private JDBCUtils() {
    }

    private static String url = CommonVars.DATABASE_URL;
    private static String user = CommonVars.DATABASE_USER;
    private static String password = CommonVars.DATABASE_PASSWORD;


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void free(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static TableVo getMysqlTableColsByJDBC(String tableName) throws Exception {
        Connection conn = null;
        Statement st = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;

        try {
            conn = JDBCUtils.getConnection();
            st = conn.createStatement();
            rs1 = st.executeQuery("SELECT table_name FROM information_schema.TABLES WHERE table_name ='"+tableName+"';");
            List<PropertyVo> list =null;
            if(rs1.next()){
            	if(list == null){
            		list = new ArrayList<PropertyVo>();
            	}
            	//rs = st.executeQuery("DESCRIBE "+tableName);
            	rs2 = st.executeQuery("SELECT  COLUMN_NAME,COLUMN_TYPE,IS_NULLABLE,COLUMN_KEY,COLUMN_DEFAULT,EXTRA,COLUMN_COMMENT FROM information_schema.columns WHERE TABLE_NAME = '"+tableName+"';");
            	while (rs2.next()) {
                    list.add(new PropertyVo(tableName,rs2.getObject(1),rs2.getObject(2),rs2.getObject(3),rs2.getObject(4),rs2.getObject(5),rs2.getObject(6),rs2.getObject(7)));
                }
            }
            
            return UtilTool.parseProperty(list);
        } finally {
            JDBCUtils.free(rs1, st, conn);
            JDBCUtils.free(rs2, st, conn);
        }

    }

}