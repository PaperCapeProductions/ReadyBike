package com.baphs.readybike.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.baphs.readybike.models.user.User;
import com.baphs.readybike.utils.HBMSessionFactory;

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
		if (logger.isDebugEnabled()) {
			logger.debug("Firstname: " + user.getFirstName() + " Lastname: " + user.getLastName());
		}
		Session session = null;
        try {
            session = _sessionFactory.openSession();
            session.saveOrUpdate(user);
            session.flush();
        } catch (Exception e) {
        	if (logger.isDebugEnabled()) {
    			logger.debug(e.getMessage());
    			e.printStackTrace();
    		}
        } finally {
            session.close();
        }
	}
	
	//==============================================================================
	// PRIVATE METHODS
	//==============================================================================
}
