package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return validateInput(startNumber, endNumber)
                ? generateMultiplicationTable(startNumber, endNumber)
                : null;
    }

    private String generateMultiplicationTable(int startNumber, int endNumber) {
        String[] multiplicationLines = new String[(endNumber - startNumber) + 1];
        for (int i = 0; i < multiplicationLines.length; i++) {
            multiplicationLines[i] = generateMultiplicationExpression(startNumber, startNumber + i);
        }

        return String.join("\n", multiplicationLines);
    }

    private String generateMultiplicationExpression(int multiplicand, int multiplier) {
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

    private boolean isFirstNumberLarger(int num1, int num2) {
        return num1 > num2;
    }
}
