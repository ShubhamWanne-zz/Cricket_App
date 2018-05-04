package com.cricket.app.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
