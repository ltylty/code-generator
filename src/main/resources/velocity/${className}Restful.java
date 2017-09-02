package com.enableets.edu.${moudleName}.microservice.restful;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.${moudleName}.framework.bo.${className}BO;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
@Api(value = "${className}管理接口")
@RestController
@RequestMapping("/microservice/${moudleName}/${className}")
public class ${className}Restful extends ServiceControllerAdapter<${className}BO> {

	
	
}