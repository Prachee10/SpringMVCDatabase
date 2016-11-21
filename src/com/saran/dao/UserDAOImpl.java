package com.saran.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.saran.domain.User;

public class UserDAOImpl implements UserDAO {
	
	 

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> listUser() {
		return hibernateTemplate.find("from User");
	}

}
