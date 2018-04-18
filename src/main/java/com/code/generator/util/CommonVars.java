package com.code.generator.util;

import java.util.HashMap;
import java.util.Map;

public class CommonVars {
	
	static Map<String,String> cache = new HashMap<String,String>();
	
	/**
	 * 数据库连接字符串
	 */
	public static  String  DATABASE_URL ;
	/**
	 * 数据库用户名
	 */
	public static  String  DATABASE_USER ;
	/**
	 * 数据库密码
	 */
	public static  String  DATABASE_PASSWORD ;
	/**
	 * 数据库驱动jar包名
	 */
	public static String  DRIVER_MANAGER_NAME ;
	/**
	 * 去除表名前缀
	 */
	public static String  TABLE_PREFIX_DEL ;
	
	/**
	 * 表名或字段名下划线
	 */
	public static String  TABLE_SPLIT_CHAR ;
	
	/**
	 * 分隔符
	 */
	public static String SPLIT ;
	
	/**
	 * 表名称
	 */
	public static String tableName ;
	
	/**
	 * 库名称
	 */
	public static String databaseName;
	
	/**
	 * 生成Java文件的绝对路径
	 */
	public static String velocityTarget ;
	
	/**
	 * 存放模板文件的绝对路径 ;
	 * 即把该项目中velocity的模板文件夹复制到D盘即可
	 */
	public static String velocity ;
	
	/**
	 * 模块名称
	 */
	public static String moudleName ;
	
	/**
	 * 生成文件存放地址前缀
	 */
	//public static String FILE_TEMP_PREFIX ;
	
	/**
	 * 业务层名称
	 */
	//public static String SERVICE ;
	
	/**
	 * Dao层名称
	 */
	//public static String DAO ;
	
	
	/**
	 * 双引号字符
	 */
	//public static String DOUBLEMARKS ;
	
	/**
	 * 项目名称
	 */
	//public static String sysName ;
	
	
	
	/**
	 * 過濾不用的屬性名
	 */
	//public static String pro_del ;
	
	
	
	public CommonVars() {
		String filePath = Class.class.getClass().getResource("/").getPath() + "config.properties" ;
		ProUtils.readProperties(filePath ) ;
		cache = ProUtils.cache ;
		databaseName = cache.get("databaseName");
		tableName = cache.get("tableName");
		DATABASE_URL = cache.get("DATABASE_URL") ;
		DATABASE_USER = cache.get("DATABASE_USER");
		DATABASE_PASSWORD = cache.get("DATABASE_PASSWORD");
		DRIVER_MANAGER_NAME = cache.get("DRIVER_MANAGER_NAME");
		TABLE_PREFIX_DEL = cache.get("TABLE_PREFIX_DEL");
		TABLE_SPLIT_CHAR = cache.get("TABLE_SPLIT_CHAR");
		SPLIT = cache.get("SPLIT");
		velocityTarget = cache.get("velocityTarget") ;
		velocity = cache.get("velocity");
		moudleName = cache.get("moudleName");
	}
	
}
