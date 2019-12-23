package com.shiva.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
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
		Session session = sessionFactory.getCurrentSession();
		return (ServiceType) session.merge(serviceType);
	}

	@Cacheable(value = "ehcache")
	public List<ServiceType> allServices() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From ServiceType", ServiceType.class);
		return query.getResultList();
	}

	@Cacheable(value="ServiceType.ById",key="#serviceId",unless="#result !=null")
	public ServiceType getServiceTypeById(Integer serviceId) {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ServiceType st where st.serviceId=:serviceId",ServiceType.class);
		query.setParameter("serviceId", serviceId);
		return (ServiceType) query.getSingleResult();
	}
	@Cacheable(value = "ServiceType.serviceType", key = "#serviceType", unless = "#serviceType != null and #serviceType.toUpperCase().startsWith('TEST')")
	public ServiceType getServiceTypeByServiceName(String serviceType) {
		return null;
	}

	public ServiceType updateServiceType(ServiceType serviceType) {
		Session session = sessionFactory.getCurrentSession();
		return (ServiceType) session.merge(serviceType);
	}

}
