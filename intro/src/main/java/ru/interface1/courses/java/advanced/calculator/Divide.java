package ru.interface1.courses.java.advanced.calculator;

import lombok.ToString;

@ToString
public class Divide extends BinaryOperation {
    @Override
    public double calc() {
        return left / right;
    }
}
