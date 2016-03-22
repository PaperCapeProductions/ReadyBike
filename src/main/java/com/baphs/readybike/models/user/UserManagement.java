package com.baphs.readybike.models.user;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baphs.readybike.dao.IUserDAO;
import com.baphs.readybike.dao.UserDAOImpl;
import com.baphs.readybike.utils.HBMSessionFactory;

public class UserManagement {

	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(UserManagement.class);
	
	//==============================================================================
	// VARIABLES
	//==============================================================================
	
	private IUserDAO _userDao;

	public UserManagement() {
		_userDao = new UserDAOImpl(HBMSessionFactory.getSessionFactory());
	}

	public void addUser(final User user) {
		if (user != null) {
			_userDao.addUser(user);
		}
	}
}
