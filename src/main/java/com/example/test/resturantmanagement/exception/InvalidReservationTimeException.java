package com.example.test.resturantmanagement.exception;

public class InvalidReservationTimeException extends RuntimeException {
    public InvalidReservationTimeException(String message) {
        super(message);
    }
}
