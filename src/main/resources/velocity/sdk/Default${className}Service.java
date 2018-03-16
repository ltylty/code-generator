package com.enableets.edu.sdk.${moudleName}.impl;

import java.util.List;

import com.enableets.edu.sdk.${moudleName}.I${className}Service;
import com.enableets.edu.sdk.${moudleName}.dto.Add${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Add${className}ResultDTO;
import com.enableets.edu.sdk.${moudleName}.dto.Count${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Edit${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}ResultDTO;
import com.enableets.edu.sdk.${moudleName}.feign.I${className}ServiceFeignClient;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
public class Default${className}Service implements I${className}Service {

	private I${className}ServiceFeignClient ${objName}ServiceFeignClient;
	
	public Default${className}Service(I${className}ServiceFeignClient ${objName}ServiceFeignClient) {
		super();
		this.${objName}ServiceFeignClient = ${objName}ServiceFeignClient;
	}

	@Override
	public Add${className}ResultDTO add(Add${className}DTO add${className}DTO) {
		return ${objName}ServiceFeignClient.add(add${className}DTO).getData();
	}

	@Override
	public Boolean edit(Edit${className}DTO edit${className}DTO) {
		return ${objName}ServiceFeignClient.edit(edit${className}DTO).getData();
	}

	@Override
	public List<Query${className}ResultDTO> query(Query${className}DTO query${className}DTO) {
		return ${objName}ServiceFeignClient.query(query${className}DTO).getData();
	}

	@Override
	public Integer count(Count${className}DTO count${className}DTO) {
		return ${objName}ServiceFeignClient.count(count${className}DTO).getData();
	}

	@Override
	public Boolean remove(String ${objName}Id) {
		return ${objName}ServiceFeignClient.remove(${objName}Id).getData();
	}


}
