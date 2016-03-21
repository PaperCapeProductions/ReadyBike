package com.baphs.readybike.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baphs.readybike.models.user.User;

@Controller
public class LoginController {

	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	private static final String VIEW_INDEX = "index";
	private static final String VIEW_LOGIN = "login";
	private static final Logger LOGGER = LoggerFactory.getLogger(CreateUserController.class);
	
	//==============================================================================
	// VARIABLES
	//==============================================================================

	private String _username;
	private String _password;
	private User _user;
	
	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	public LoginController() {
		_user = new User();
	}
	
	//==============================================================================
	// PUBLIC METHODS
	//==============================================================================

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String welcome1(ModelMap model) {
		model.addAttribute("user", _user);
		
		// Spring uses InternalResourceViewResolver and return back login.jsp
		return VIEW_LOGIN;
	}
	
	/**
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomeName1(@ModelAttribute User user, ModelMap model) {
		
		//TODO Validate credentials and retrieve user from DB! 
		
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Username: " + user.getUsername() + " Password: " + user.getPassword());
		}
		
		return VIEW_LOGIN;
	}
	
	//==============================================================================
	// PRIVATE METHODS
	//==============================================================================

	//==============================================================================
	// DEFAULT METHODS
	//==============================================================================

	//==============================================================================
	// INNER CLASSES
	//==============================================================================
}
