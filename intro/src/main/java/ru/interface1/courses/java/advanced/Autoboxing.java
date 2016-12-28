package ru.interface1.courses.java.advanced;

public class Autoboxing {
    public static void main(String[] args) {
//        test();

        poolingTest();


    }

    private static void poolingTest() {
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);

        i1 = 128;
        i2 = 128;
        System.out.println(i1 == i2);
    }

    private static void test() {
        Integer j = 171; // создание объекта+упаковка
        Integer k = ++j; // распаковка+операция+упаковка
        System.out.println(j == k);
        int i = 2;
        k += i + j;

        System.out.println(k);
    }
}
