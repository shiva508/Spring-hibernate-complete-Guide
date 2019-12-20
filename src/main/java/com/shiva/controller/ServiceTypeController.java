package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.ServiceType;
import com.shiva.service.ServiceTypeService;
@RestController
public class ServiceTypeController {
	@Autowired
	private ServiceTypeService serviceTypeService;
	@PostMapping(value="/saveSevice",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ServiceType saveService(@RequestBody ServiceType serviceType) {
		return serviceTypeService.saveService(serviceType);
	}
	@GetMapping(value="/allServices",produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<ServiceType> allServices(){
		return serviceTypeService.allServices();
	}
}
