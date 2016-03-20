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
	
	private int _id;
	private String _firstName;
	private String _lastName;
	
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
	public User(final String firstName, final String lastName) {
		_firstName = firstName;
		_lastName = lastName;
	}
	
	/**
	 * @return
	 */
	public int getId() {
		return _id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
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
	
	//==============================================================================
	// PRIVATE MTHODS
	//==============================================================================

}
