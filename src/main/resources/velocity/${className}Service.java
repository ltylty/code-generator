package com.enableets.edu.${moudleName}.framework.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enableets.edu.${moudleName}.framework.bo.${className}BO;
import com.enableets.edu.${moudleName}.framework.dao.${className}DAO;
import com.enableets.edu.${moudleName}.framework.po.${className}PO;
import com.enableets.edu.${moudleName}.framework.util.BeanUtils;
import com.enableets.edu.framework.core.service.ServiceAdapter;
import com.enableets.edu.framework.core.util.StringUtils;
import com.enableets.edu.framework.core.util.token.ITokenGenerator;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * ${className}业务类
 * @author toy_liu@enable-ets.com
 * 2018/01/05
 */
@Service
@Transactional
public class ${className}Service extends ServiceAdapter<${className}BO, ${className}PO> {	

	@Autowired
	private ITokenGenerator tokenGenerator;
	
	@Autowired
	private ${className}DAO ${objName}DAO;
	
	/** 
	 * 新建
	 * @param ${objName}BO
	 * @return
	 */
	public ${className}BO add(${className}BO ${objName}BO) {
		// TODO 设置id
		${className}PO record = BeanUtils.convert(${objName}BO, ${className}PO.class);
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		${objName}DAO.insert(record);
		return ${objName}BO;
	}
	
	/** 
	 * 修改
	 * @param ${objName}BO
	 */
	public void edit(${className}BO ${objName}BO) {
		${className}PO record = BeanUtils.convert(${objName}BO, ${className}PO.class);
		record.setUpdateTime(new Date());
		${objName}DAO.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 查询
	 *
	 * @param ${objName}BO the teaching program BO
	 * @param offset the offset
	 * @param rows the rows
	 * @return the list
	 */
	public List<${className}BO> query(${className}BO ${objName}BO, Integer offset, Integer rows) {
		if (offset == null) {
			offset = 0;
		}
		if (rows == null) {
			rows = 10;
		}
		RowBounds rowBounds = new RowBounds(offset, rows);
		Example example = setExample(${objName}BO);
		example.setOrderByClause("create_time desc");
		List<${className}PO> list = ${objName}DAO.selectByExampleAndRowBounds(example, rowBounds);
		return BeanUtils.convert(list, ${className}BO.class);
	}

	/**
	 * 设置查询条件
	 *
	 * @param ${objName}BO the teaching program BO
	 * @return the example
	 */
	private Example setExample(${className}BO ${objName}BO) {
		Example example = new Example(${className}PO.class);
		Criteria criteria = example.createCriteria();
		// TODO 设置查询条件
		return example;
	}
	
	/**
	 * 查询数量
	 *
	 * @param ${objName}BO the teaching program BO
	 * @return the integer
	 */
	public Integer count(${className}BO ${objName}BO) {
		Example example = setExample(${objName}BO);
		int count = ${objName}DAO.selectCountByExample(example);
		return count;
	}
	
	/**
	 * 删除
	 *
	 * @param ${objName}Id the teaching program id
	 */
	public void remove(String ${objName}Id) {
		Example example = new Example(${className}PO.class);
		example.createCriteria().andEqualTo("${objName}Id", ${objName}Id);
		${objName}DAO.deleteByExample(example);
	}
	
	/**
	 * 获取主键
	 *
	 * @return the id
	 */
	private String getId() {
		return tokenGenerator.getToken().toString();
	}
	
}
