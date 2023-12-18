import com.example.my_interface.Message;
import com.example.people.Person;
import com.example.people.Student;
import com.example.calculator.Calculator;
import com.example.use_interface_serial_clone_compare.Serial_Clone_Compare;
import com.example.worker.Worker;
import com.example.my_interface_order.Order;
import com.example.my_interface_order.Service;
import com.example.my_interface_order.Product;

import java.io.*;

public class Main implements Message { // klasa Main implementuje interfejs Message; Serializable,Comparable,Clobable należa do java.lang i nie trzeba ich jawnie importowac
    public static void main(String[] args) {
        //tworzenie obiektu Person
        Person newPerson = new Person("", "");
        newPerson.enterData(); //wprowadzanie danych
        System.out.println("Person: " + newPerson);
        System.out.println();

        // tworzenie Student
        Student newStudent = new Student("", "", 0);
        newStudent.enterData(); //wprowadzanie danych
        //newStudent.enterDataS();
        try {
            newStudent.setYearOfstudy(newStudent.getYearOfstudy());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Student: " + newStudent); //wyświetlenie w konsoli
        System.out.println();

        System.out.println("Try to overloading and override methods");
        Person newPerson2 = new Person("Tomasz", "Jeliński"); //utworzenie kolejnego obiektu
        System.out.println("Person2: \n" + newPerson2.toString()); //wyświetlenie
        newPerson2.setName("Tymek"); //przeciążenie metodysetName
        System.out.println("New Person2 after name change: \n" + newPerson2.toString()); //

        Student newStudent2 = new Student("John", "Been", 2);
        System.out.println("Student2: \n" + newStudent2.toString());
        newStudent2.setYearOfstudy(3);
        System.out.println("New Student2 after changing year of study: \n"+ newStudent2.toString());
        newStudent2.enterData(); //przeciązanie metody enterData w Student
        System.out.println("New Student2 after enter new dta: \n" + newStudent2.toString());
        System.out.println();

        // Tworzenie tablicy typu bazowego (Person)
        System.out.println("Table of object");
        Person[] people = new Person[3];
        // tworzenie obiektów klas Person i Student i umieszczanie ich w tablicy
        people[0] = new Person("John", "Wick");
        people[1] = new Student("Alice", "Wonderland", 2);
        people[2] = new Student("Bob", "Builder", 3);

        // odwoływanie się do przesłoniętej metody toString() dla każdego obiektu
        for (Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println();
        // własne porównywanie obiektów
        System.out.println("My own comparision");
        Person comparePerson1 = people[0];
        Person comparePerson2 = people[0];
        Person comparePerson3 = people[1];

        if (comparePerson1.equals(comparePerson2)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        if (comparePerson1.equals(comparePerson3)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        System.out.println();

        System.out.println("Calculator");
        Calculator calculator = new Calculator();

        calculator.enterData();
        System.out.println();

        int sum = calculator.add(calculator.a, calculator.b);
        double sum2 = calculator.add(calculator.aDouble, calculator.bDouble);
        int dif = calculator.subtract(calculator.a, calculator.b);
        double dif2 = calculator.subtract(calculator.aDouble, calculator.bDouble);
        int pro = calculator.multiply(calculator.a, calculator.b);
        double pro2 = calculator.mulitiply(calculator.aDouble, calculator.bDouble);
        int quo = calculator.divide(calculator.a, calculator.b);
        double quo2 = calculator.divide(calculator.aDouble, calculator.bDouble);
        int com = calculator.compounding(calculator.a, calculator.b);
        double com2 = calculator.compounding(calculator.aDouble, calculator.bDouble);
        System.out.println();

        System.out.println("Results of the calculator: ");
        System.out.println("Sum int: " + sum);
        System.out.println("Sum double: " + sum2);
        System.out.println("Difference int: " + dif);
        System.out.println("Difference double: " + dif2);
        System.out.println("Product int: " + pro);
        System.out.println("Product double: " + pro2);
        System.out.println("Quotient int: " + quo);
        System.out.println("Quotient double: " + quo2);
        System.out.println("Compounding int: " + com);
        System.out.println("Compounding double: " + com2);
        System.out.println();

        Main main = new Main() {}; // tworzenie obiektu Main jako obiektu anonimowego implementującego interfejs Message
        System.out.println("Show information by interface Message using anonymous object");
        main.showMessageOne("One 1."); // wywołanie metod interfejsu do wyświetlenia komunikatów
        main.showMessageTwo("Two 2.");
        main.showMessageThree("Three 3.");

        System.out.println("Casting on interface Message");
        Message myInterface = (Message) main; //rzutowniae main na interfejs Message
        myInterface.showMessageOne("Cast on myInterface");
        System.out.println();

        //System.out.println(new);
        //obiekt anonimowy klasy Worker
        System.out.println("Anonymous object class Worker");
        System.out.println(new Worker ("Anonymous", "Worker", "Owner").toString());
        System.out.println();

        //interfejs order z klasami product i service
        System.out.println("Interface with class product & service");
        Order product = new Product ("Notebook", 2000.0);
        Order service = new Service ("Notebook repair",100, 3.5);

        System.out.println("Show order detail for product: ");
        product.showDetail();
        System.out.println("Promo price: "+ (product.calculatePrice()-(0.10 * product.calculatePrice())));
        System.out.println("\nOrder detail for service: ");
        service.showDetail();
        System.out.println("Price: " + service.calculatePrice());
        System.out.println();

        // tworzenie obiektu klasy Serial_Clone_Compare
        System.out.println("Use interface serialize clone compare");
        Serial_Clone_Compare object1 = new Serial_Clone_Compare(42, "Example");

        // serializacja do strumienia
        //ByteArrayOutputStream klasa z pakietu java.io, umożliwia zapisywanie danych jako bajty w pamięci
        //byteStream zmienna przechowująca strumień bajtowy, który będzie używany do serializacji obiektu
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(byteStream)) {
            out.writeObject(object1);
            System.out.println("Object has been serialized to the byte stream.");
        } catch (IOException e) { //obsługa wyjątku, który występuje, gdy wystąpi błąd wejścia/wyjścia
            // obsługa błędów związanych z operacją IO (np. IOException)
            e.printStackTrace();
        }

        // klonowanie obiektu
        Serial_Clone_Compare object2 = null;
        try {
            // wykorzystanie metody clone do sklonowania obiektu
            object2 = (Serial_Clone_Compare) object1.clone();
            System.out.println("Object has been cloned.");
        } catch (CloneNotSupportedException e) { //obsługa wyjątku, który występuje, gdy nie można sklonować obiektu
            e.printStackTrace(); //wykorzystywana w blokach obsługi wyjątków do wypisania informacji o błędach
        }

        // porównywanie obiektów
        if (object1.compareTo(object2) == 0) {
            System.out.println("Objects 1 and 2 are identical.");
        } else {
            System.out.println("Objects 1 and 2 are different.");
        }

    }
    @Override
    public void showMessageOne(String message) {
        System.out.println("First message: " + message);
    }
    @Override
    public void showMessageTwo(String message) {
        System.out.println("Second message: " + message);
    }
    @Override
    public void showMessageThree(String message) {
        System.out.println("Third message: " + message);
        System.out.println();
    }
}