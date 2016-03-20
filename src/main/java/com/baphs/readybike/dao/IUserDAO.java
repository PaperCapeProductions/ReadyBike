package com.baphs.readybike.dao;

import com.baphs.readybike.models.user.User;

/**
 * @author andres
 *
 */
public interface IUserDAO {
	
	/**
	 * @param user
	 */
	public void addUser(final User user);
	
}
