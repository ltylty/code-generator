package com.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class UtilTool {

	/**
	 * 解析表属性
	 * @param propertyList
	 * @return
	 */
	public static TableVo parseProperty(List<PropertyVo> propertyList) {
		
		if(propertyList == null){
			return null;
		}
		TableVo tableVo= new TableVo();
		tableVo.setTableOriginal(propertyList.get(0).getLowerCaseTableName());
		tableVo.setLowerCaseTableName(formatTableName(propertyList.get(0).getLowerCaseTableName().toLowerCase()));
		tableVo.setUpperCaseTableName(toUpperCaseString(tableVo.getLowerCaseTableName()));
		
		List<PropertyVo> pkCols = new ArrayList<PropertyVo>();
		List<PropertyVo> propertyCols = new ArrayList<PropertyVo>();
		PropertyVo temp = null;
		for(PropertyVo po : propertyList){
			temp = new PropertyVo();
			temp.setFieldOriginal(po.getLowerCaseFieldCol());
			temp.setLowerCaseFieldCol(formatString(po.getLowerCaseFieldCol().toLowerCase()));
			temp.setTypeCol(parseType(po.getTypeCol().toUpperCase()));
			temp.setLowerCaseTableName(tableVo.getLowerCaseTableName());
			temp.setUpperCaseFieldCol(toUpperCaseString(temp.getLowerCaseFieldCol()));
			//接收原先的值
			temp.setDefaultCol(po.getDefaultCol());
			temp.setExtraCol(po.getExtraCol());
			temp.setKeyCol(po.getKeyCol());
			temp.setNullCol(po.getNullCol());
			
			if(po.getKeyCol()!=null && po.getKeyCol().trim().toUpperCase().equals("PRI")){
				pkCols.add(temp);
			}else{
				propertyCols.add(temp);
			}
		}
//		//判断处理是否要加PK属性
//		if(pkCols.size()>1){
//			temp = new PropertyVo();
//			temp.setFieldOriginal(null);
//			temp.setLowerCaseFieldCol("id");
//			temp.setTypeCol(tableVo.getUpperCaseTableName()+"PK");
//			temp.setLowerCaseTableName(tableVo.getLowerCaseTableName());
//			temp.setUpperCaseFieldCol("Id");
//			//接收原先的值
//			temp.setDefaultCol("");
//			temp.setExtraCol("");
//			temp.setKeyCol("");
//			temp.setNullCol("NO");
//			propertyCols.add(temp);
//		}
		
		tableVo.setPks(pkCols);
		tableVo.setPropertyList(propertyCols);
		tableVo.setMulti(pkCols.size()>1?true:false);
		
		return tableVo;
	}

	/**
	 * 转为java类型
	 * @param typeCol
	 * @return
	 */
	private static String parseType(String typeCol) {
		if(match(typeCol,new String[]{"VARCHAR","CHAR","TEXT"})){
			return "java.lang.String";
		}
		if(match(typeCol,new String[]{"BLOB"})){
			return "java.lang.byte[]";
		}
		if(match(typeCol,new String[]{"INTEGER","INT"})){
			return "java.lang.Long";
		}
		if(match(typeCol,new String[]{"TINYINT","SMALLINT","MEDIUMINT"})){
			return "java.lang.Integer";
		}
		if(match(typeCol,new String[]{"BIT"})){
			return "java.lang.Boolean";
		}
		if(match(typeCol,new String[]{"BIGINT"})){
			return "java.math.BigInteger";
		}
		if(match(typeCol,new String[]{"FLOAT"})){
			return "java.lang.Float";
		}
		if(match(typeCol,new String[]{"DOUBLE","NUMERIC"})){
			return "java.lang.Double";
		}
		if(match(typeCol,new String[]{"DECIMAL"})){
			return "java.math.BigDecimal";
		}
		if(match(typeCol,new String[]{"DATE","YEAR"})){
			return "java.util.Date";
		}
		if(match(typeCol,new String[]{"TIME"})){
			return "java.util.Date";
		}
		if(match(typeCol,new String[]{"DATETIME","TIMESTAMP"})){
			return "java.util.Date";
		}
		return "java.lang.String";
	}

	/**
	 * 是否匹配
	 * @param typeCol
	 * @param params
	 * @return
	 */
	private static boolean match(String typeCol, String[] params) {
		for(String s : params){
			if(typeCol.contains(s)){
				return true;
			}
		}
		return false;
	}

	/**
	 * 格式化表名
	 * @param TableName
	 * @return
	 */
	private static String formatTableName(String TableName){
		if(CommonVars.TABLE_PREFIX_DEL.trim().length()>0){
			int i = CommonVars.TABLE_PREFIX_DEL.trim().length();
			if(TableName.length()>i && TableName.substring(0, i).equals(CommonVars.TABLE_PREFIX_DEL.trim())){
				TableName = TableName.substring(i);
			}
		}
		return formatString(TableName);
	}

	/**
	 * 格式化字符串
	 * 例: menu_id --> menuId
	 * @param str
	 * @return
	 */
	private static String formatString(String str) {
		if(!str.contains(CommonVars.TABLE_SPLIT_CHAR))
			return str;
		int index = str.indexOf(CommonVars.TABLE_SPLIT_CHAR);
		if(index == 0){
			return formatString(str.substring(1));
		}
		if(index == str.length()-1){
			return str.substring(0, index);
		}
		str = str.substring(0, index) + str.substring(index+1, index+2).toUpperCase()
		          +str.substring(index+2);
		
		return formatString(str);
	}
	
	/**
	 * 创建文件夹，如果存在则不重新创建
	 * @param path
	 */
	public static void createFilePath(String path){
		File file = new File(path);
		if(!file.isDirectory()){
			if(!file.exists()){
				file.mkdirs();
			}
		}
	}
	
	/**
	 * 创建文件，如果存在，则先删除
	 * @param path
	 * @param content
	 */
	public static void createFile(String path, String content) {
		File file = new File(path);
		if(file.exists()){
			file.delete();
		}
		BufferedWriter bw = null;
		OutputStream out=null;

		try {
			out=new FileOutputStream(file);
			bw = new BufferedWriter(new OutputStreamWriter(out,"UTF-8"));
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	/**
	 * 字符串首字母转为大写
	 * @param str
	 * @return
	 */
	public static String toUpperCaseString(String str){
		if(str==null || str.trim().equals("")){
			return null;
		}
		
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return str;
	}
	
}
