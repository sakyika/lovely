package com.sakk.lovely.chiropractic.exception;

public class ChiroDuplicatePatientException extends Exception {
	private static final long serialVersionUID = 6532938055712085137L;

	public ChiroDuplicatePatientException() {
	}

	public ChiroDuplicatePatientException(String arg0) {
		super(arg0);
	}

	public ChiroDuplicatePatientException(Throwable arg0) {
		super(arg0);
	}

	public ChiroDuplicatePatientException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ChiroDuplicatePatientException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
