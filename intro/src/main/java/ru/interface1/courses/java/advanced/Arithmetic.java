package ru.interface1.courses.java.advanced;

public class Arithmetic {
    public static void main(String[] args) {
        int i = 3;

//         i = -i++ + (i++) + (-i);
        int x1 = -i;
        System.out.println("1 = " + x1 + ", i = " + i);

        int x2 = i++;
        System.out.println("2 = " + x2 + ", i = " + i);

        int x3 = i++;
        System.out.println("3 = " + x3 + ", i = " + i);

        int x4 = -i;
        System.out.println("4 = " + x4 + ", i = " + i);

        int x5 = x1 + x3;
        System.out.println("5 = " + x5 + ", i = " + i);

        int x6 = x5 + x4;
        System.out.println("6 = " + x6 + ", i = " + i);
    }
}
