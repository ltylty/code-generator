package com.enableets.edu.learning.microservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;

import com.enableets.edu.module.service.controller.ServiceControllerAdapter;
import com.enableets.edu.learning.microservice.bo.ProblemReportScreenshotBO;

/**
 * ProblemReportScreenshot微服务接口
 */
@Api(value = "ProblemReportScreenshot微服务接口")
@RestController
@RequestMapping("/microservice/learning/ProblemReportScreenshot")
public class ProblemReportScreenshotController extends ServiceControllerAdapter<ProblemReportScreenshotBO> {

	
	
}
