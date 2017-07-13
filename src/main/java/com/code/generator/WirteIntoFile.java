package com.code.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.code.generator.util.CommonVars;
import com.code.generator.util.JDBCUtils;
import com.code.generator.util.PropertyVo;
import com.code.generator.util.TableVo;

public class WirteIntoFile {
	// 初始化参数缓存
	static {
		new CommonVars();
	}
	static String tableName = CommonVars.tableName;
	static String moudleName = CommonVars.moudleName;
	static String velocityTarget = CommonVars.velocityTarget ;
	static String velocity = CommonVars.velocity ;
	static TableVo tvo = null;
	static VelocityContext context = null;

	/**
	 * 获取表信息
	 * @param tblName 表名
	 */
	public static void initTbaleInfo(String tblName) {
		try {
			tvo = JDBCUtils.getMysqlTableColsByJDBC(tblName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public static void initContext() {
		String radioPro = null;
		String param_value = null;
		String typeName = null;

		List<PropertyVo> pro = tvo.getPropertyList();
		List<PropertyVo> proPk = tvo.getPks();

		context.put("serviceName", tvo.getLowerCaseTableName());
		context.put("daoName", tvo.getLowerCaseTableName());

		context.put("paramName", tvo.getLowerCaseTableName());
		context.put("rltType", tvo.getUpperCaseTableName());
		context.put("param_type", tvo.getUpperCaseTableName());
		context.put("tblName", tvo.getTableOriginal());
		context.put("nameSpaceSql", tvo.getUpperCaseTableName());

		context.put("title_name", tvo.getLowerCaseTableName());
		context.put("formName", tvo.getLowerCaseTableName());

		context.put("className", tvo.getUpperCaseTableName());
		context.put("objName", tvo.getLowerCaseTableName());
		context.put("moudleName", moudleName);

		context.put("isMulti", tvo.isMulti());
		if (tvo.isMulti()) {
			param_value = tvo.getUpperCaseTableName() + "PK";
			typeName = tvo.getUpperCaseTableName() + "PK";

			List<String> list = new ArrayList<String>();
			for (int i = 0; i < proPk.size(); i++) {
				list.add("%{id." + proPk.get(i).getLowerCaseFieldCol() + "}");
			}
			radioPro = list.toString().substring(1,list.toString().length() - 1);
		} else {
			radioPro = "%{" + proPk.get(0).getLowerCaseFieldCol() + "}";
			param_value = proPk.get(0).getTypeCol();
			typeName = proPk.get(0).getTypeCol();
		}
		Date date = new Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd");
        String currDate = sdf.format(date);

		context.put("radioPro", radioPro);
		context.put("propertys", pro);
		context.put("param_obj", param_value);
		context.put("typeName", typeName);
		context.put("pks", proPk);
		context.put("currDate", currDate);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initTbaleInfo(tableName);
		context = new VelocityContext();
		initContext();
		try {
			createFilePath(velocityTarget);
			createTargetFiles(velocity , velocityTarget , "", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建文件夹，如果存在则不重新创建
	 * 
	 * @param path
	 */
	public static void createFilePath(String path) {
		File file = new File(path);
		if (!file.isDirectory()) {
			if (!file.exists()) {
				file.mkdirs();
			}
		}
	}

	/**
	 * 创建文件，如果存在，则先删除
	 * 
	 * @param path
	 * @param content
	 */
	public static void createFile(String path, String content) {
		File pathFile = new File(path);
		createFilePath(pathFile.getParent());
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		}
		BufferedWriter bw = null;
		OutputStream out = null;

		try {
			out = new FileOutputStream(file);
			bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 根据文件源格式读出
	 * 
	 * @param file
	 * @return
	 */
	@SuppressWarnings("finally")
	public static StringBuffer readFile(File file) {
		String fileType = "utf-8";
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file), fileType));
			String word = "";
			while ((word = br.readLine()) != null) {
				//velocity会自动跳过空格，这样模板中逻辑判断语句前有空格的话不会自动去除,因此这里自动去除前的多余空格
				if(StringUtils.indexOf(word.trim(), "#")==0 && StringUtils.indexOf(word.trim(), "#{")!=0)
				{
					word = StringUtils.trim(word);
				}

				sb.append(word + "\r\n");
				
				
			}
			br.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
			return sb.toString().equals("") ? null : sb;
		}

	}

	public static void createTargetFiles(String sourcePath, String targetPath,
			String filePath, boolean flag) {
		File file;
		StringWriter writer = null;
		if (flag) {
			file = new File(sourcePath);
		} else {
			file = new File(filePath);
		}

		if (file.exists() && file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				try {
					Boolean isMulti = (Boolean)context.get("isMulti");						
					if(!isMulti && f.getName().startsWith("${className}PK"))
					{
						continue;
					}
					
					VelocityEngine ve = new VelocityEngine();
					Properties properties = new Properties();
					//properties.setProperty("directive.foreach.counter.initial.value", "0");
					properties.setProperty("resource.loader", "srl");
					properties.setProperty("srl.resource.loader.class", "com.code.generator.util.MyResourceLoader");
					ve.init(properties);
					//ve.init("velocity.properties");
					Template fileContextTemplate = ve.getTemplate(readFile(
							f).toString(), "utf-8");
					writer = new StringWriter();
					// 将环境数据转化输出
					fileContextTemplate.merge(context, writer);
					writer.close();
					String fileContext = writer.toString();
					VelocityEngine veFileName = new VelocityEngine();

					veFileName.init(properties);

					String filePathStr = f.getPath().replace(sourcePath,targetPath);
					filePathStr = filePathStr.replaceAll("/", "SWPC007");
					filePathStr = filePathStr.replaceAll("\\\\", "SWPC007");
					Template fileNameTemplate = veFileName.getTemplate(
							filePathStr, "utf-8");

					writer = new StringWriter();
					// 将环境数据转化输出
					fileNameTemplate.merge(context, writer);
					writer.close();

					filePathStr = writer.toString();

					createFile(filePathStr.replaceAll("SWPC007", "\\\\"),
							fileContext);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (writer != null) {
						try {
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
