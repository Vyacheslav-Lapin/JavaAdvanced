package ru.interface1.courses.java.advanced.calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BinaryOperation {
    protected double left;
    protected double right;
    public abstract double calc();
}
