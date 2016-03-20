package com.baphs.readybike.utils;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecurityUtils {

	//==============================================================================
	// CONSTANTS
	//==============================================================================
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityUtils.class);
	
	//==============================================================================
	// VARIABLES
	//==============================================================================

	//==============================================================================
	// CONSTRUCTORS
	//==============================================================================
	
	//==============================================================================
	// PUBLIC METHODS
	//==============================================================================
	
	public static String generateSHA256(final String plaintext) {
		String result = "";
		
		result = new Sha256Hash(plaintext).toBase64();
		
		return result;
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
