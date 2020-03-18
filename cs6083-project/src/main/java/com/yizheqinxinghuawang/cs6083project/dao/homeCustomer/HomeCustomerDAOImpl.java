package com.yizheqinxinghuawang.cs6083project.dao.homeCustomer;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yizheqinxinghuawang.cs6083project.entity.home.HomeCustomer;

@Repository
public class HomeCustomerDAOImpl implements HomeCustomerDAO {

	private EntityManager entityManager;

	@Autowired
	public HomeCustomerDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<HomeCustomer> findAllCustomer() {
		Session curSession = entityManager.unwrap(Session.class);

		Query<HomeCustomer> query = curSession.createQuery("from HomeCustomer", HomeCustomer.class);

		return query.getResultList();

	}

}
