package ro.aesm.qc.api.exception;

public class QcExecutionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QcExecutionException(String message) {
		super(message);
	}

	public QcExecutionException(String message, Object... args) {
		super(String.format(message, args));
	}

	public QcExecutionException(String message, Throwable cause) {
		super(message, cause);
	}

	public QcExecutionException(String message, Throwable cause, Object... args) {
		super(String.format(message, args), cause);
	}
}
