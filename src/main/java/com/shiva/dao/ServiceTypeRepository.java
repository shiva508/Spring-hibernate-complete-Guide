package com.shiva.dao;

import java.util.List;

import com.shiva.model.ServiceType;

public interface ServiceTypeRepository {
	public ServiceType saveService(ServiceType serviceType);
	public List<ServiceType> allServices();
}
