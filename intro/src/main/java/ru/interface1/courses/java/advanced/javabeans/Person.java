package ru.interface1.courses.java.advanced.javabeans;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class Person {
    private int age;
    private String pathronimic;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public static void main(String[] args) {

        val person = new Person()
                .setAge(34)
                .setPathronimic("Юрьевич")
                .setFirstName("Вячеслав")
                .setLastName("Лапин")
                .setDob(LocalDate.of(1982, 7, 29));

        person.setAge(33);
        System.out.println(person);
    }
}
