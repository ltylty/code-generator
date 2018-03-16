package com.enableets.edu.teaching.microservice.restful;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.module.service.core.Response;
import com.enableets.edu.teaching.framework.bo.TeachingPackageBO;
import com.enableets.edu.teaching.microservice.vo.AddTeachingPackageResultVO;
import com.enableets.edu.teaching.microservice.vo.AddTeachingPackageVO;
import com.enableets.edu.teaching.microservice.vo.EditTeachingPackageVO;
import com.enableets.edu.teaching.microservice.vo.QueryTeachingPackageVO;
import com.enableets.edu.teaching.microservice.vo.QueryTeachingPackageResultVO;
import com.enableets.edu.teaching.microservice.vo.CountTeachingPackageVO;
import com.enableets.edu.teaching.framework.service.TeachingPackageService;

import com.enableets.edu.teaching.framework.util.BeanUtils;


/**
 * @author toy_liu@enable-ets.com
 * 2018/03/16
 */
@Api(value = "TeachingPackage管理接口")
@RestController
@RequestMapping("/microservice/teaching/teachingpackage")
public class TeachingPackageRestful extends ServiceControllerAdapter<TeachingPackageBO> {

	@Autowired
	TeachingPackageService teachingPackageService;
	
	@ApiOperation(value = "新增")
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Response<AddTeachingPackageResultVO> add(@RequestBody @Validated AddTeachingPackageVO addTeachingPackageVO) {
		TeachingPackageBO teachingPackageBO = teachingPackageService.add(BeanUtils.convert(addTeachingPackageVO, TeachingPackageBO.class));
		return responseTemplate.format(BeanUtils.convert(teachingPackageBO, AddTeachingPackageResultVO.class));
	}
	
	@ApiOperation(value = "编辑")
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public Response<Boolean> edit(@RequestBody EditTeachingPackageVO editTeachingPackageVO) {
		teachingPackageService.edit(BeanUtils.convert(editTeachingPackageVO, TeachingPackageBO.class));
		return responseTemplate.format(true);
	}
	
	@ApiOperation(value = "查询")
	@RequestMapping(value="/query", method = RequestMethod.POST)
	public Response<List<QueryTeachingPackageResultVO>> query(@RequestBody QueryTeachingPackageVO queryTeachingPackageVO) {
		TeachingPackageBO teachingPackageBO = BeanUtils.convert(queryTeachingPackageVO, TeachingPackageBO.class);
		List<TeachingPackageBO> list = teachingPackageService.query(teachingPackageBO, queryTeachingPackageVO.getOffset(), queryTeachingPackageVO.getRows());
		return responseTemplate.format(BeanUtils.convert(list, QueryTeachingPackageResultVO.class));
	}
	
	@ApiOperation(value = "查询数量")
	@RequestMapping(value="/count", method = RequestMethod.POST)
	public Response<Integer> count(@RequestBody CountTeachingPackageVO countTeachingPackageVO) {
		TeachingPackageBO teachingPackageBO = BeanUtils.convert(countTeachingPackageVO, TeachingPackageBO.class);
		Integer count = teachingPackageService.count(teachingPackageBO);
		return responseTemplate.format(count);
	}
	
	@ApiOperation(value = "删除")
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public Response<Boolean> remove(
			@ApiParam(required = true, value = "主键标识") 
			@RequestParam(required = true, value = "teachingPackageId")
			@NotEmpty String teachingPackageId) {
		teachingPackageService.remove(teachingPackageId);
		return responseTemplate.format(true);
	}  
}
