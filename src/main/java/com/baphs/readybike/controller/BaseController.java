package com.baphs.readybike.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baphs.readybike.models.user.User;

/**
 * @author andres
 *
 */
@Controller
public class BaseController {
	
	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	private static final String VIEW_INDEX = "index";
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	//==============================================================================
	// VARIABLES
	//==============================================================================
	
	private static int _counter = 0;
	
	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	
	
	//==============================================================================
	// PUBLIC METHODS
	//==============================================================================
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("user", new User("Andres", "Pineda"));
		
		if (logger.isDebugEnabled()) {
			logger.debug("[Welcome] counter : {}", ++_counter);
		}
		
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}
	
	/**
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String welcomeName(@ModelAttribute User user, Model model) {
		
		//model.addAttribute("message", "Welcome " + name);
		//model.addAttribute("counter", ++_counter);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Firstname: " + user.getFirstName() + " Lastname: " + user.getLastName());
		}
		
		return VIEW_INDEX;
	}
	
	//==============================================================================
	// PRIVATE METHODS
	//==============================================================================
	
}
