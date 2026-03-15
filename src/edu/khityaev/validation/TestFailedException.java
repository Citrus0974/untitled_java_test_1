package edu.khityaev.validation;

public class TestFailedException extends RuntimeException {
    public TestFailedException(String message) {
        super(message);
    }
    public TestFailedException(){super();}
}
