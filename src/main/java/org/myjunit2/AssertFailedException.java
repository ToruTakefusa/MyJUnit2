package org.myjunit2;

public class AssertFailedException extends RuntimeException {
    public AssertFailedException(String message) {
        super(message);
    }
}
