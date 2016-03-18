package com.baphs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	
	private static int _counter = 0;
	private static final String VIEW_INDEX = "index";
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++_counter);
		
		if (logger.isDebugEnabled()) {
			logger.debug("[Welcome] counter : {}", _counter);
		}
		
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
		
		model.addAttribute("message", "Welcome" + name);
		model.addAttribute("counter", ++_counter);
		
		if (logger.isDebugEnabled()) {
			logger.debug("[WelcomeName] counter : {}", _counter);
		}
		
		return VIEW_INDEX;
	}
	
}
