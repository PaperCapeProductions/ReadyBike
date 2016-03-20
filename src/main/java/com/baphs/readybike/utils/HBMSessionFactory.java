package com.baphs.readybike.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andres
 *
 */
public class HBMSessionFactory {
	
	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	private static final Logger logger = LoggerFactory.getLogger(HBMSessionFactory.class);
	
	//==============================================================================
	// VARIABLES
	//==============================================================================
	
	private static SessionFactory _sessionFactory;
	
	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	/**
	 * Default Constructor
	 */
	public HBMSessionFactory() {
		
	}

	//==============================================================================
	// PUBLIC METHODs
	//==============================================================================
	
	/**
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		if (_sessionFactory == null) {
			try {
				_sessionFactory = new Configuration().configure("/hibernate/hibernate.cfg.xml").buildSessionFactory();
			} catch (Throwable t) {
				if (logger.isDebugEnabled()) {
					logger.debug("Throwing Error due to: ", t.getMessage());
				}
				throw new ExceptionInInitializerError(t);
			}
		}
		return _sessionFactory;
	}
	
	/**
	 * 
	 */
	public static void shutdownSessionFactory() {
		getSessionFactory().close();
	}
	
	//==============================================================================
	// PRIVATE METHODS
	//==============================================================================
}
