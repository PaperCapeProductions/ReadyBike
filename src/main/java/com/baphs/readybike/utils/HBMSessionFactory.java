package com.baphs.readybike.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HBMSessionFactory {

	private static final Logger logger = LoggerFactory.getLogger(HBMSessionFactory.class);
	private static SessionFactory _sessionFactory;

	public HBMSessionFactory() {

	}

	public static SessionFactory getSessionFactory() {
		if (_sessionFactory == null) {
			try {
				_sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable t) {
				if (logger.isDebugEnabled()) {
					logger.debug("Throwing Error due to: ", t.getMessage());
				}
				throw new ExceptionInInitializerError(t);
			}
		}
		return _sessionFactory;
	}
}
