package com.example.people;

import java.util.*; //importowanie wykorzystywanych klas

public class Student extends com.example.people.Person { // Student dziedziczy po Person z package com.example.people
    private int yearOfstudy; //deklaracja pola klasy Student

    public Student(String name, String surname, int yearOfstudy) {
        super(name, surname); // wywołanie konstruktora klasy bazowej
        this.yearOfstudy = yearOfstudy; // inicjalizacja pola podaniem argumentu
    }
    public void enterDataS() { //wprowadzanie danych poprzez scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of study:");

        try {
            this.yearOfstudy = scanner.nextInt(); //przypisanie wartości ze strumienia wejściowego do  pola studentId
        } catch (InputMismatchException e) { //obsługa wyjątku gdy wprowadzimy złe dane uruchomi sie kod wewnątrz bloku wyświetlając komunikat o wpr. poprawnych danych
            System.out.println("Invalid input. Please enter a valid integer for yearOfstudy.");
            scanner.nextLine(); // Konsumuje błędne dane wejściowe
            enterData(); // Rekurencyjnie [wywołując sama siebie] ponawia próbę wprowadzenia danych z konsoli
        }
    }
    public void enterData() {
        super.enterData();
        enterDataS();

    }

    // zwracanie pola yearOfstudy oraz logika sprawdzająca
    public int getYearOfstudy() {
        return yearOfstudy;
    }
    public void setYearOfstudy(int yearOfstudy) {
        // sprawdzamy czy yearOfstudy zawiera tylko cycfry
        if (String.valueOf(yearOfstudy).matches("\\d+")) { //konwersja int do String i sprawdzenie za pomocą \\d+ czy ciąg znaków zawiera jeden czy więcej znaków i są to tylko cyfry [\\d zakres 0-9 / + jedno lub wiecej wystąpien]
            this.yearOfstudy = yearOfstudy; //przypisanie wartości do pola po spelnieniu warunku
        } else { //inaczej realizowany kod z komunikatem
            System.out.println("Invalid yearOfstudy. It should contain only digits.");
        }
    }
    // inf. dla kompilatora, ze metoda ma przesłonić/nadpisać metodę toString() z klasy nadrzędnej
    @Override
    public String toString() { //przesłania metode z klasy Person
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", yearOfstudy='" + yearOfstudy + '\'' +
                '}';
    }
}

