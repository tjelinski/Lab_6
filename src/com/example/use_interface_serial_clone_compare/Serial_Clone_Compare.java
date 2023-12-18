package com.example.use_interface_serial_clone_compare;

import java.io.*; // zawiera klasy i interfejsy do obsługi operacji wejścia/wyjścia (I/O), takie jak strumienie danych, operacje plikowe,wykorzystane interfejsy są wbudowane w język Java
public class Serial_Clone_Compare implements Serializable, Cloneable, Comparable<Serial_Clone_Compare> {
    private int field;
    private String name;

    // konstruktor klasy, inicjalizuje pola obiektu
    public Serial_Clone_Compare(int field, String name) {
        this.field = field;
        this.name = name;
    }

    // nadpisanie metody clone z interfejsu Cloneable pozwala na utworzenie kopii obiektu
    @Override
    public Object clone() throws CloneNotSupportedException { //metoda może zgłosić wyjątek CloneNotSupportedException jeśli obiekt nie obsługuje klonowania
        return super.clone(); //wywołuje implementację clone z klasy nadrzędnej (Object). Metoda clone z klasy Object tworzy nowy obiekt i kopiuje wszystkie pola obiektu pierwotnego do nowego obiektu
    }

    // nadpisanie metody compareTo z interfejsu Comparable umożliwia porównywanie obiektów i jest wykorzystywane później w metodzie compareTo
    @Override
    public int compareTo(Serial_Clone_Compare otherObject) {
        int comparison = Integer.compare(this.field, otherObject.field);

        if (comparison == 0) {
            comparison = this.name.compareTo(otherObject.name);
        }

        return comparison;
    }

    // Getter dla pola "field"
    public int getField() {
        return field;
    }

    // Getter dla pola "name"
    public String getName() {
        return name;
    }
}


