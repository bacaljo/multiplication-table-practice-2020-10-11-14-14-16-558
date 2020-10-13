package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return validateInput(startNumber, endNumber)
                ? generateMultiplicationTable(startNumber, endNumber)
                : null;
    }

    private String generateMultiplicationTable(int startNumber, int endNumber) {
        return null;
    }

    private boolean validateInput(int startNumber, int endNumber) {
        return false;
    }
}
