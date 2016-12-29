package ru.interface1.courses.java.advanced.calculator;

public class Sum extends BinaryOperation {
    @Override
    public double calc() {
        return left + right;
    }
}
