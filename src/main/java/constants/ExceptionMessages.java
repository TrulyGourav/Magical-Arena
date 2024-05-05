package main.java.constants;

public enum ExceptionMessages {
    INVALID_CRED_VALUE("Please pass a positive value"),
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

