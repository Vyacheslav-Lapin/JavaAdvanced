package ru.interface1.courses.java.advanced;

public class Immutable2 {

    private final int a;
    private final int b;
    private final Immutable i;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Immutable2(int a, int b, Immutable i) {
        this.a = a;
        this.b = b;
        this.i = i;
    }

    public static void main(String[] args) {
        new Immutable2(1, 2, new Immutable(3, 4, immutable2));
    }
}
