package ru.interface1.courses.java.advanced;

public class Autoboxing {
    public static void main(String[] args) {
        Integer j = 171; // создание объекта+упаковка
        Integer k = ++j; // распаковка+операция+упаковка
        System.out.println(j == k);
        int i = 2;
        k += i + j;

        System.out.println(k);


    }
}
