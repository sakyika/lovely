package com.sakk.lovely.chiropractic.exception;

public class ChiroPatientNotFoundException extends Exception {
	
	private static final long serialVersionUID = -1402337502045439388L;
	
	public ChiroPatientNotFoundException() {
    }

    public ChiroPatientNotFoundException(String message) {
        super(message);
    }

    public ChiroPatientNotFoundException(Throwable cause) {
        super(cause);
    }

    public ChiroPatientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChiroPatientNotFoundException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
