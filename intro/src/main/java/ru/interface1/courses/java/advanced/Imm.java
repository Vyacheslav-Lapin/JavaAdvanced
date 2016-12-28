package ru.interface1.courses.java.advanced;

public abstract class Imm {

    public abstract int getX();

    public abstract int getY();

    public abstract Immutable2 getImmutable2();

    public static void main(String[] args) {
        Imm imm = new Immutable(2, 3);
        // ...
        System.out.println(imm.getX());
    }
}
