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
            multiplicationLines[i] = generateMultiplicationLine(startNumber, startNumber + i);
        }

        return String.join("\r\n", multiplicationLines);
    }

    private String generateMultiplicationLine(int num1, int num2) {
        String[] multiplicationExpressions = new String[(num2 - num1) + 1];
        for (int i = 0; i < multiplicationExpressions.length; i++) {
            multiplicationExpressions[i] = generateMultiplicationExpression(num1 + i, num2);
        }

        return String.join("  ", multiplicationExpressions);
    }

    private String generateMultiplicationExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }

    private boolean validateInput(int startNumber, int endNumber) {
        final int RANGE_LOWER_LIMIT = 1;
        final int RANGE_UPPER_LIMIT = 1000;

        boolean isFirstNumberLarger = isStartNumberLarger(startNumber, endNumber);
        boolean isFirstNumberWithinRange = isNumberWithinRange(startNumber, RANGE_LOWER_LIMIT, RANGE_UPPER_LIMIT);
        boolean isSecondNumberWithinRange = isNumberWithinRange(endNumber, RANGE_LOWER_LIMIT, RANGE_UPPER_LIMIT);

        return !isFirstNumberLarger && isFirstNumberWithinRange && isSecondNumberWithinRange;
    }

    private boolean isNumberWithinRange(int number, int lowerLimit, int upperLimit) {
        return number >= lowerLimit && number <= upperLimit;
    }

    private boolean isStartNumberLarger(int startNum, int endNum) {
        return startNum > endNum;
    }
}
