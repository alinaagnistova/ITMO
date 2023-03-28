package ru.itmo.lab3.error;

public class IncorrectBodyException extends NoSuchFieldException{
    private String bodyPart;

    public IncorrectBodyException(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public IncorrectBodyException(String message, String bodyPart) {
        super(message);
        this.bodyPart = bodyPart;
    }

    public IncorrectBodyException() {
    }
}

