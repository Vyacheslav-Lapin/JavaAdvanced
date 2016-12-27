package ru.interface1.courses.java.advanced;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        int[] xs = {1,2,3,4,5,6,7,8,9};

        int reduce = Arrays.stream(xs)
                .parallel()
                .filter(value -> value > 2)
                .map(operand -> operand + 5)
                .reduce(0, (left, right) -> left + right);

        System.out.println(reduce);
    }
}
