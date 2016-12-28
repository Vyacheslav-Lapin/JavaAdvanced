package ru.interface1.courses.java.advanced;

public class Immutable extends Imm {
    private final int x;
    private final int y;
    private Immutable2 immutable2;

    Immutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Immutable2 getImmutable2() {
        return immutable2;
    }

    void setImmutable2(Immutable2 immutable2) {
        this.immutable2 = immutable2;
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable(1, 2);
        Immutable2 immutable2 = new Immutable2(3, 3, immutable);
        immutable.setImmutable2(immutable2);

        //...
    }
}
