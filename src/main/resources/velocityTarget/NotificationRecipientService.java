package com.enableets.edu.notification.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enableets.edu.framework.core.service.ServiceAdapter;
import org.springframework.beans.BeanUtils;
import com.enableets.edu.notification.framework.po.NotificationRecipientPO;
import com.enableets.edu.notification.microservice.bo.NotificationRecipientBO;

/**
 * notification_recipient Service层
 */
@Service
public class NotificationRecipientService extends ServiceAdapter<NotificationRecipientBO, NotificationRecipientPO> {	

	protected NotificationRecipientPO translatePO(NotificationRecipientBO bo) {
		NotificationRecipientPO po = new NotificationRecipientPO();
		BeanUtils.copyProperties(bo, po);
		return po;
	}
	
	protected NotificationRecipientBO translateBO(NotificationRecipientPO po) {
		NotificationRecipientBO bo = new NotificationRecipientBO();
		BeanUtils.copyProperties(po, bo);
		return bo;
	}
	
	protected List<NotificationRecipientBO> translateBO(List<NotificationRecipientPO> poList) {
		List<NotificationRecipientBO> boList = new ArrayList<NotificationRecipientBO>();
		if(poList!=null && poList.size()>0){
			for (NotificationRecipientPO po : poList) {
				boList.add(translateBO(po));
			}
		}
		return boList;
	}
	
	protected List<NotificationRecipientPO> translatePO(List<NotificationRecipientBO> boList) {
		List<NotificationRecipientPO> poList = new ArrayList<NotificationRecipientPO>();
		if(boList!=null && boList.size()>0){
			for (NotificationRecipientBO bo : boList) {
				poList.add(translatePO(bo));
			}
		}
		return poList;
	}
	
}
