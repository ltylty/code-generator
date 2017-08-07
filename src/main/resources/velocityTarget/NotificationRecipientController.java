package com.enableets.edu.notification.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.notification.microservice.bo.NotificationRecipientBO;

/**
 * NotificationRecipient微服务接口
 */
@Api(value = "NotificationRecipient微服务接口")
@RestController
@RequestMapping("/microservice/notification/NotificationRecipient")
public class NotificationRecipientController extends ServiceControllerAdapter<NotificationRecipientBO> {

	
	
}
