package com.shiva.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.shiva.model.ServiceType;

@Repository
public class ServiceTypeRepositoryImpl implements ServiceTypeRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public ServiceType saveService(ServiceType serviceType) {
		Session session=sessionFactory.getCurrentSession();
		return (ServiceType) session.merge(serviceType);
	}
	@Cacheable(value="ehcache")
	public List<ServiceType> allServices() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("From ServiceType",ServiceType.class);
		return query.getResultList();
	}

}
