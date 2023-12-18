package com.example.people;

import java.util.*; //importowanie wykorzystywanych klas

public class Person { //deklaracja klasy
    private String name;
    private String surname;

    public Person(String name, String surname) { //konstruktor klasy
        this.name = name;
        this.surname = surname;
    }

    /* metody dostępowe do pól klasy , odczyt (get) i ustawianie (set) wartości pól obiektu,
    pola prywatne można bezpiecznie odczytywać i aktualizować ich wartości*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    // metoda do wprowadzania danych z konsoli za pomocą scanner
    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        this.name = scanner.nextLine();

        System.out.println("Enter your surname:");
        this.surname = scanner.nextLine();

    }

    // inf. dla kompilatora, ze metoda ma przesłonić/nadpisać metodę toString()
    @Override
    public String toString() { // ma przesłonić metode toString()
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

