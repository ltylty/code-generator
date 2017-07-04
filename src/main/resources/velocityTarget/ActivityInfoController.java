package com.enableets.edu.learning.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.learning.microservice.bo.ActivityInfoBO;

/**
 * ActivityInfo微服务接口
 */
@Api(value = "ActivityInfo微服务接口")
@RestController
@RequestMapping("/microservice/learning/ActivityInfo")
public class ActivityInfoController extends ServiceControllerAdapter<ActivityInfoBO> {

	
	
}
