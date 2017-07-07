package com.enableets.edu.${moudleName}.microservice.service;

import org.springframework.stereotype.Service;

import com.enableets.edu.framework.core.service.ServiceAdapter;
import com.enableets.edu.${moudleName}.framework.po.${className}PO;
import com.enableets.edu.${moudleName}.microservice.bo.${className}BO;

/**
 * ${tblName} Service层
 */
@Service
public class ${className}Service extends ServiceAdapter<${className}BO, ${className}PO> {	
	
}