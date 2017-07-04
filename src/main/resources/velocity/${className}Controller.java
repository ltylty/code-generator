package com.enableets.edu.${moudleName}.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.${moudleName}.microservice.bo.${className}BO;

/**
 * ${className}微服务接口
 */
@Api(value = "${className}微服务接口")
@RestController
@RequestMapping("/microservice/${moudleName}/${className}")
public class ${className}Controller extends ServiceControllerAdapter<${className}BO> {

	
	
}