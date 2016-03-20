package com.baphs.readybike.models.user;

/**
 * @author andres
 *
 */

public class User {
	
	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	//==============================================================================
	// VARIABLES
	//==============================================================================
	
	private Long _id;
	private String _firstName;
	private String _lastName;
	private String _username;
	private String _password;
	
	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	/**
	 * Default Constructor
	 */
	public User() {
		
	}
	
	//==============================================================================
	// PUBLIC METHODS
	//==============================================================================
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public User(final String firstName, final String lastName, final String username) {
		_firstName = firstName;
		_lastName = lastName;
		_username = username;
	}
	
	/**
	 * @return
	 */
	public Long getId() {
		return _id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		_id = id;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return _firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return _lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	
	/**
	 * @return
	 */
	public String getUsername() {
		return _username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		_username = username;
	}
	
	/**
	 * @return
	 */
	public String getPassword() {
		return _password;
	}

	/**
	 * @param username
	 */
	public void setPassword(String password) {
		_password = password;
	}
	
	//==============================================================================
	// PRIVATE MTHODS
	//==============================================================================

}
