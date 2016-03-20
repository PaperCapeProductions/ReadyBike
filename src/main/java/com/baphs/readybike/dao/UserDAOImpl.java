package com.baphs.readybike.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.baphs.readybike.models.user.User;

public class UserDAOImpl extends HibernateDaoSupport implements IUserDAO {
	
	private SessionFactory _sessionFactory;
	
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		_sessionFactory = sessionFactory;
	}
	
	@Override
	public void addUser(User user) {	
		getHibernateTemplate().save(user);
	}
}
