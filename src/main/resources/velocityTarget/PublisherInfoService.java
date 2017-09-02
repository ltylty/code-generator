package com.enableets.edu.textbook.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enableets.edu.framework.core.service.ServiceAdapter;
import org.springframework.beans.BeanUtils;
import com.enableets.edu.textbook.framework.po.PublisherInfoPO;
import com.enableets.edu.textbook.microservice.bo.PublisherInfoBO;

/**
 * publisher_info Service层
 */
@Service
public class PublisherInfoService extends ServiceAdapter<PublisherInfoBO, PublisherInfoPO> {	

}
