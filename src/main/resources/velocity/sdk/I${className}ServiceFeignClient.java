package com.enableets.edu.sdk.${moudleName}.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.enableets.edu.sdk.${moudleName}.dto.Add${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Add${className}ResultDTO;
import com.enableets.edu.sdk.${moudleName}.dto.Count${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Edit${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}DTO;
import com.enableets.edu.sdk.${moudleName}.dto.Query${className}ResultDTO;
import com.enableets.edu.sdk.${moudleName}.dto.Response;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
@FeignClient(value = "${moudleName}-microservice")
public interface I${className}ServiceFeignClient {
	
	@RequestMapping(value="/microservice/${moudleName}/${path}/add", method = RequestMethod.POST)
	public Response<Add${className}ResultDTO> add(@RequestBody @Validated Add${className}DTO add${className}DTO);
	
	@RequestMapping(value="/microservice/${moudleName}/${path}/edit", method = RequestMethod.POST)
	public Response<Boolean> edit(@RequestBody Edit${className}DTO edit${className}DTO);
	
	@RequestMapping(value="/microservice/${moudleName}/${path}/query", method = RequestMethod.POST)
	public Response<List<Query${className}ResultDTO>> query(@RequestBody Query${className}DTO query${className}DTO);
	
	@RequestMapping(value="/microservice/${moudleName}/${path}/count", method = RequestMethod.POST)
	public Response<Integer> count(@RequestBody Count${className}DTO count${className}DTO);
	
	@RequestMapping(value="/microservice/${moudleName}/${path}/remove", method = RequestMethod.POST)
	public Response<Boolean> remove(@RequestParam(required = true, value = "id") String id);
}
