package com.shiva.service;

import java.util.List;

import com.shiva.model.ServiceType;

public interface ServiceTypeService {
	public ServiceType saveService(ServiceType serviceType);
	public List<ServiceType> allServices();
}
