package com.enableets.edu.billing.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enableets.edu.framework.core.service.ServiceAdapter;
import com.wistron.swpc.framework.util.BeanUtils;
import com.enableets.edu.billing.framework.po.AmountChangeLogPO;
import com.enableets.edu.billing.microservice.bo.AmountChangeLogBO;

/**
 * billing_amount_change_log Service层
 */
@Service
public class AmountChangeLogService extends ServiceAdapter<AmountChangeLogBO, AmountChangeLogPO> {	

	protected AmountChangeLogPO translatePO(AmountChangeLogBO bo) {
		AmountChangeLogPO po = new AmountChangeLogPO();
		BeanUtils.copyProperties(bo, po);
		return po;
	}
	
	protected AmountChangeLogBO translateBO(AmountChangeLogPO po) {
		AmountChangeLogBO bo = new AmountChangeLogBO();
		BeanUtils.copyProperties(po, bo);
		return bo;
	}
	
	protected List<AmountChangeLogBO> translateBO(List<AmountChangeLogPO> poList) {
		List<AmountChangeLogBO> boList = new ArrayList<AmountChangeLogBO>();
		if(poList!=null && poList.size()>0){
			for (AmountChangeLogPO po : poList) {
				boList.add(translateBO(po));
			}
		}
		return boList;
	}
	
	protected List<AmountChangeLogPO> translatePO(List<AmountChangeLogBO> boList) {
		List<AmountChangeLogPO> poList = new ArrayList<AmountChangeLogPO>();
		if(boList!=null && boList.size()>0){
			for (AmountChangeLogBO bo : boList) {
				poList.add(translatePO(bo));
			}
		}
		return poList;
	}
	
}
