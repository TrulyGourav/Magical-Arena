package com.example.arena.constants;

public enum ExceptionMessages {
    INVALID_CRED_VALUE("Please pass a positive value"),
    INVALID_SIDE_VALUE("Number of sides must be positive")
    ;

    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }
    //only getter to access message
    public String getMessage() {
        return message;
    }
}

