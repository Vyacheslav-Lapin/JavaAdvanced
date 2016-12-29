package ru.interface1.courses.java.advanced.calculator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class BinaryOperation {
    protected double left;
    protected double right;
    public abstract double calc();
}
