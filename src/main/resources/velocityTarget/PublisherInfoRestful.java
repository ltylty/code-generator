package com.enableets.edu.textbook.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.textbook.microservice.bo.PublisherInfoBO;

/**
 * PublisherInfo微服务接口
 */
@Api(value = "PublisherInfo微服务接口")
@RestController
@RequestMapping("/microservice/textbook/PublisherInfo")
public class PublisherInfoRestful extends ServiceControllerAdapter<PublisherInfoBO> {

	
	
}
