package ru.interface1.courses.java.advanced.arrays;

public class Max {
    public static void main(String[] args) {

        int[] a = { 5, 10, 0, -5, 16, -2 };
        int max = a[0];

        for (int anA : a)
            if (max < anA)
                max = anA;

        System.out.println("Max=" + max);

        for(int x : a)
            System.out.print(x + " ");

        System.out.println();

    }
}
