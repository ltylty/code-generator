package com.enableets.edu.${moudleName}.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enableets.edu.framework.core.service.ServiceAdapter;
import org.springframework.beans.BeanUtils;
import com.enableets.edu.${moudleName}.framework.po.${className}PO;
import com.enableets.edu.${moudleName}.microservice.bo.${className}BO;

/**
 * ${tblName} Service层
 */
@Service
public class ${className}Service extends ServiceAdapter<${className}BO, ${className}PO> {	

}