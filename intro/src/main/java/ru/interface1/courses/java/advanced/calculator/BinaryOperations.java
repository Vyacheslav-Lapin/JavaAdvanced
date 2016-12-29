package ru.interface1.courses.java.advanced.calculator;

import lombok.ToString;

@ToString
public class BinaryOperations {

    private BinaryOperation[] binaryOperations;
    private int operationAddIndex;
    private int operationReadIndex;

    public BinaryOperations(int size) {
        binaryOperations = new BinaryOperation[size];
    }

    public void add(BinaryOperation operation) {
        binaryOperations[operationAddIndex++] = operation;
    }

    public BinaryOperation next() {
        assert operationReadIndex < operationAddIndex;
        return binaryOperations[operationReadIndex++];
    }

    public boolean hasNext() {
        return operationReadIndex < operationAddIndex;
    }

    public void resetReadIndex() {
        operationReadIndex = 0;
    }
}
