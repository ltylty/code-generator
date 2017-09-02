package com.enableets.edu.textbook.microservice.restful;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.textbook.framework.bo.PublisherInfoBO;

/**
 * @author toy_liu@enable-ets.com
 * 2017/09/02
 */
@Api(value = "PublisherInfo管理接口")
@RestController
@RequestMapping("/microservice/textbook/PublisherInfo")
public class PublisherInfoRestful extends ServiceControllerAdapter<PublisherInfoBO> {

	
	
}
