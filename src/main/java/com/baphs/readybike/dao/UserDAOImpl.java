package com.baphs.readybike.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.baphs.readybike.models.user.User;

/**
 * @author andres
 *
 */
public class UserDAOImpl extends HibernateDaoSupport implements IUserDAO {
	
	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	//==============================================================================
	// VARIABLES
	//==============================================================================
	
	private SessionFactory _sessionFactory;
	
	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	/**
	 * @param sessionFactory
	 */
	public UserDAOImpl(SessionFactory sessionFactory) {
		_sessionFactory = sessionFactory;
	}
	
	//==============================================================================
	// PUBLIC METHODS
	//==============================================================================
	
	/* (non-Javadoc)
	 * @see com.baphs.readybike.dao.IUserDAO#addUser(com.baphs.readybike.models.user.User)
	 */
	@Override
	public void addUser(User user) {	
		getHibernateTemplate().save(user);
	}
	
	//==============================================================================
	// PRIVATE METHODS
	//==============================================================================
}
