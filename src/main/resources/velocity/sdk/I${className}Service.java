package com.enableets.edu.sdk.${moudleName};

import java.util.List;

import com.enableets.edu.sdk.${moudleName}.dto.Add${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Add${className}ResultDTO;
import com.enableets.edu.sdk.${moudleName}.dto.Count${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Edit${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}ResultDTO;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
public interface I${className}Service {
	
	public Add${className}ResultDTO add(Add${className}DTO add${className}DTO);
	
	public Boolean edit(Edit${className}DTO edit${className}DTO);
	
	public List<Query${className}ResultDTO> query(Query${className}DTO query${className}DTO);
	
	public Integer count(Count${className}DTO count${className}DTO);
	
	public Boolean remove(String ${objName}Id);
}
