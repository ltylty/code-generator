package com.enableets.edu.teaching.framework.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enableets.edu.teaching.framework.bo.TeachingPackageBO;
import com.enableets.edu.teaching.framework.dao.TeachingPackageDAO;
import com.enableets.edu.teaching.framework.po.TeachingPackagePO;
import com.enableets.edu.teaching.framework.util.BeanUtils;
import com.enableets.edu.framework.core.service.ServiceAdapter;
import com.enableets.edu.framework.core.util.StringUtils;
import com.enableets.edu.framework.core.util.token.ITokenGenerator;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * TeachingPackage业务类
 * @author toy_liu@enable-ets.com
 * 2018/01/05
 */
@Service
@Transactional
public class TeachingPackageService extends ServiceAdapter<TeachingPackageBO, TeachingPackagePO> {	

	@Autowired
	private ITokenGenerator tokenGenerator;
	
	@Autowired
	private TeachingPackageDAO teachingPackageDAO;
	
	/** 
	 * 新建
	 * @param teachingPackageBO
	 * @return
	 */
	public TeachingPackageBO add(TeachingPackageBO teachingPackageBO) {
		// TODO 设置id
		TeachingPackagePO record = BeanUtils.convert(teachingPackageBO, TeachingPackagePO.class);
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		teachingPackageDAO.insert(record);
		return teachingPackageBO;
	}
	
	/** 
	 * 修改
	 * @param teachingPackageBO
	 */
	public void edit(TeachingPackageBO teachingPackageBO) {
		TeachingPackagePO record = BeanUtils.convert(teachingPackageBO, TeachingPackagePO.class);
		record.setUpdateTime(new Date());
		teachingPackageDAO.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 查询
	 *
	 * @param teachingPackageBO the teaching program BO
	 * @param offset the offset
	 * @param rows the rows
	 * @return the list
	 */
	public List<TeachingPackageBO> query(TeachingPackageBO teachingPackageBO, Integer offset, Integer rows) {
		if (offset == null) {
			offset = 0;
		}
		if (rows == null) {
			rows = 10;
		}
		RowBounds rowBounds = new RowBounds(offset, rows);
		Example example = setExample(teachingPackageBO);
		example.setOrderByClause("create_time desc");
		List<TeachingPackagePO> list = teachingPackageDAO.selectByExampleAndRowBounds(example, rowBounds);
		return BeanUtils.convert(list, TeachingPackageBO.class);
	}

	/**
	 * 设置查询条件
	 *
	 * @param teachingPackageBO the teaching program BO
	 * @return the example
	 */
	private Example setExample(TeachingPackageBO teachingPackageBO) {
		Example example = new Example(TeachingPackagePO.class);
		Criteria criteria = example.createCriteria();
		// TODO 设置查询条件
		return example;
	}
	
	/**
	 * 查询数量
	 *
	 * @param teachingPackageBO the teaching program BO
	 * @return the integer
	 */
	public Integer count(TeachingPackageBO teachingPackageBO) {
		Example example = setExample(teachingPackageBO);
		int count = teachingPackageDAO.selectCountByExample(example);
		return count;
	}
	
	/**
	 * 删除
	 *
	 * @param teachingPackageId the teaching program id
	 */
	public void remove(String teachingPackageId) {
		Example example = new Example(TeachingPackagePO.class);
		example.createCriteria().andEqualTo("teachingPackageId", teachingPackageId);
		teachingPackageDAO.deleteByExample(example);
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
