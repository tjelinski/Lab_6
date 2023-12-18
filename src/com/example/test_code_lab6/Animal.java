package com.example.test_code_lab6;

class Animal {
    void giveVoice() {
        System.out.println("animal Voice");
    }
}
class Dog extends Animal {
    @Override
    void giveVoice() {
        System.out.println("woof, woof!");
    }
}
