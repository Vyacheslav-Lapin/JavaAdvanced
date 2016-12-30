package lambdas;

import java.util.function.IntToDoubleFunction;

public class Lambdas {
    public static void main(String[] args) {
        IntToDoubleFunction divide = i -> i / 10d;
        System.out.println(divide.applyAsDouble(5));
    }
}
