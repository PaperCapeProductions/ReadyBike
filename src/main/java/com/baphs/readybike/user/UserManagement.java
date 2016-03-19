package com.baphs.readybike.user;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baphs.readybike.utils.HBMSessionFactory;

public class UserManagement {
	
	private static final Logger logger = LoggerFactory.getLogger(UserManagement.class);
	
	public UserManagement() {
		
	}
	
	public Integer addUser(final String firstName, final String lastName) {
		Session session = HBMSessionFactory.getSessionFactory().openSession();
		Transaction tx = null;
		Integer userID = null;
		
		try{
			tx = session.beginTransaction();
			User user = new User(firstName, lastName);
			userID = (Integer) session.save(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			if (logger.isDebugEnabled()) {
				logger.debug(getClass().getName(), e.getMessage());
			}
		} finally {
			session.close();
		}
		
		return userID;
	}
}
