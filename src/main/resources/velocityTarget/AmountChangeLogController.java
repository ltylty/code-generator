package com.enableets.edu.billing.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.billing.microservice.bo.AmountChangeLogBO;

/**
 * AmountChangeLog微服务接口
 */
@Api(value = "AmountChangeLog微服务接口")
@RestController
@RequestMapping("/microservice/billing/AmountChangeLog")
public class AmountChangeLogController extends ServiceControllerAdapter<AmountChangeLogBO> {

	
	
}
