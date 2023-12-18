package com.example.test_code_lab6;

public class Main {
    public static void main(String[] args) {
        // kod z polimorfizm
        Vehicle[] vehicles = {
                new Bicycle("BrandA", 2),
                new Motorcycle("BrandB", true),
                new Car("BrandC", 4)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.println(vehicle.toString());
            System.out.println();
        }

        //kod z przesłonięcie
        Animal animal = new Animal();
        animal.giveVoice();
        Dog dog = new Dog();
        dog.giveVoice();
        Animal animal2 = new Dog();
        animal2.giveVoice();
        System.out.println();

        //przeciążenie
        System.out.println(Example.sum(2, 3)); // odwołujemy się statycznie do metody sum z klasy example, mozna by było zaimportowac import static com.example.test_code_lab6.Example.sum;
        System.out.println(Example.sum(2.5, 3.5));
        System.out.println(Example.sum("Hello, ", "world!"));
        System.out.println();

        //abstrakcyjna + wywołanie obiektu anonimowego
        AbstractAnimal hen = new AbstractAnimal() {
            @Override
            void giveVoice() {
                System.out.println("Co-Co-Co");
            }
        };
        hen.giveVoice();
        System.out.println();

        //interfejs
        MessageInterface welcome = new MessageInterface() {
            @Override
            public void show(String content) {
                System.out.println("Hello! " + content);
            }
        };
        welcome.show("Today we have a beautyfull day");
    }
}



