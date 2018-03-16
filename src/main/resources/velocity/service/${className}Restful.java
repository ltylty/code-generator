package com.enableets.edu.${moudleName}.microservice.restful;

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
import com.enableets.edu.${moudleName}.framework.bo.${className}BO;
import com.enableets.edu.${moudleName}.microservice.vo.Add${className}ResultVO;
import com.enableets.edu.${moudleName}.microservice.vo.Add${className}VO;
import com.enableets.edu.${moudleName}.microservice.vo.Edit${className}VO;
import com.enableets.edu.${moudleName}.microservice.vo.Query${className}VO;
import com.enableets.edu.${moudleName}.microservice.vo.Query${className}ResultVO;
import com.enableets.edu.${moudleName}.microservice.vo.Count${className}VO;
import com.enableets.edu.${moudleName}.framework.service.${className}Service;

import com.enableets.edu.${moudleName}.framework.util.BeanUtils;


/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
@Api(value = "${className}管理接口")
@RestController
@RequestMapping("/microservice/${moudleName}/${path}")
public class ${className}Restful extends ServiceControllerAdapter<${className}BO> {

	@Autowired
	${className}Service ${objName}Service;
	
	@ApiOperation(value = "新增")
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Response<Add${className}ResultVO> add(@RequestBody @Validated Add${className}VO add${className}VO) {
		${className}BO ${objName}BO = ${objName}Service.add(BeanUtils.convert(add${className}VO, ${className}BO.class));
		return responseTemplate.format(BeanUtils.convert(${objName}BO, Add${className}ResultVO.class));
	}
	
	@ApiOperation(value = "编辑")
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public Response<Boolean> edit(@RequestBody Edit${className}VO edit${className}VO) {
		${objName}Service.edit(BeanUtils.convert(edit${className}VO, ${className}BO.class));
		return responseTemplate.format(true);
	}
	
	@ApiOperation(value = "查询")
	@RequestMapping(value="/query", method = RequestMethod.POST)
	public Response<List<Query${className}ResultVO>> query(@RequestBody Query${className}VO query${className}VO) {
		${className}BO ${objName}BO = BeanUtils.convert(query${className}VO, ${className}BO.class);
		List<${className}BO> list = ${objName}Service.query(${objName}BO, query${className}VO.getOffset(), query${className}VO.getRows());
		return responseTemplate.format(BeanUtils.convert(list, Query${className}ResultVO.class));
	}
	
	@ApiOperation(value = "查询数量")
	@RequestMapping(value="/count", method = RequestMethod.POST)
	public Response<Integer> count(@RequestBody Count${className}VO count${className}VO) {
		${className}BO ${objName}BO = BeanUtils.convert(count${className}VO, ${className}BO.class);
		Integer count = ${objName}Service.count(${objName}BO);
		return responseTemplate.format(count);
	}
	
	@ApiOperation(value = "删除")
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public Response<Boolean> remove(
			@ApiParam(required = true, value = "主键标识") 
			@RequestParam(required = true, value = "id")
			@NotEmpty String id) {
		${objName}Service.remove(id);
		return responseTemplate.format(true);
	}  
}