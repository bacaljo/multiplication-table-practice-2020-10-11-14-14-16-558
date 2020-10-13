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
        boolean isFirstNumberLarger = isFirstNumberLarger(startNumber, endNumber);
        boolean isFirstNumberWithinRange = isNumberWithinRange(startNumber, 1, 1000);
        boolean isSecondNumberWithinRange = isNumberWithinRange(endNumber, 1, 1000);

        return !isFirstNumberLarger && isFirstNumberWithinRange && isSecondNumberWithinRange;
    }

    private boolean isNumberWithinRange(int startNumber, int lowerLimit, int upperLimit) {
        return false;
    }

    private boolean isFirstNumberLarger(int startNumber, int endNumber) {
        return false;
    }
}
