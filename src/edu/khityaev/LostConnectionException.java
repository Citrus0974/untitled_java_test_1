package edu.khityaev;

public class LostConnectionException extends Exception{
    public LostConnectionException() {
    }

    public LostConnectionException(String message) {
        super(message);
    }

    public LostConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public LostConnectionException(Throwable cause) {
        super(cause);
    }
}
