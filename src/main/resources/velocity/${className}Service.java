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

	protected ${className}PO translatePO(${className}BO bo) {
		${className}PO po = new ${className}PO();
		if(bo != null) {
			BeanUtils.copyProperties(bo, po);
		}
		return po;
	}
	
	protected ${className}BO translateBO(${className}PO po) {
		${className}BO bo = new ${className}BO();
		if(po != null) {
			BeanUtils.copyProperties(po, bo);
		}
		return bo;
	}
	
	protected List<${className}BO> translateBO(List<${className}PO> poList) {
		List<${className}BO> boList = new ArrayList<${className}BO>();
		if(poList!=null && poList.size()>0){
			for (${className}PO po : poList) {
				boList.add(translateBO(po));
			}
		}
		return boList;
	}
	
	protected List<${className}PO> translatePO(List<${className}BO> boList) {
		List<${className}PO> poList = new ArrayList<${className}PO>();
		if(boList!=null && boList.size()>0){
			for (${className}BO bo : boList) {
				poList.add(translatePO(bo));
			}
		}
		return poList;
	}
	
}