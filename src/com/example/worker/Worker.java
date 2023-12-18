package com.example.worker;

public class Worker {
    String name, surname, job;

    public Worker(String name, String surname, String job) { //konstruktor klasy
        this.name = name;
        this.surname = surname;
        this.job = job;
    }

    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
