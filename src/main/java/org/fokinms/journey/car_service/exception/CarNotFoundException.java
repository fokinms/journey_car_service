package org.fokinms.journey.car_service.exception;

import java.util.NoSuchElementException;

public class CarNotFoundException extends NoSuchElementException {
    public CarNotFoundException(String message) {
        super(message);
    }
}
