package ru.itmo.lab3.error;

public class BodyPartDuplicationException extends RuntimeException{
    private String bodyPart;

    public BodyPartDuplicationException(String message, Throwable cause, String bodyPart) {
        super(message, cause);
        this.bodyPart = bodyPart;
    }

    public BodyPartDuplicationException(String message) {
        super(message);
    }
}
