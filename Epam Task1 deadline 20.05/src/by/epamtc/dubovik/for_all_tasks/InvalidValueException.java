package by.epamtc.dubovik.for_all_tasks;

public class InvalidValueException extends Exception {
		
	public InvalidValueException() {}
		
	public InvalidValueException(String s) {
		super(s);
	}
		
	public InvalidValueException(String s, Throwable cause) {
		super(s, cause);
	}
		
	public InvalidValueException(Throwable cause) {
		super(cause);
	}
}
