package com.company;

public class InvalidIssueExcaption extends RuntimeException {
    public InvalidIssueExcaption() {
    }

    public InvalidIssueExcaption(String message) {
        super(message);
    }
}
