package com.enableets.edu.message.microservice.restful;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.message.framework.bo.MsgInfoBO;

/**
 * @author toy_liu@enable-ets.com
 * 2017/09/23
 */
@Api(value = "MsgInfo管理接口")
@RestController
@RequestMapping("/microservice/message/MsgInfo")
public class MsgInfoRestful extends ServiceControllerAdapter<MsgInfoBO> {

	
	
}
