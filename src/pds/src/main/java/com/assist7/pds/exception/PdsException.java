package com.assist7.pds.exception;

/**
 * PDS异常类
 * 
 * @author Qiaoxin.Hong
 *
 */
public class PdsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PdsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PdsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PdsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PdsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PdsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
