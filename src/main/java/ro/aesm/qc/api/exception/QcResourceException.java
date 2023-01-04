package ro.aesm.qc.api.exception;

public class QcResourceException extends Exception {

	private static final long serialVersionUID = 1L;

	public QcResourceException(String message) {
		super(message);
	}

	public QcResourceException(String message, Object... args) {
		super(String.format(message, args));
	}

	public QcResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public QcResourceException(String message, Throwable cause, Object... args) {
		super(String.format(message, args), cause);
	}

}
