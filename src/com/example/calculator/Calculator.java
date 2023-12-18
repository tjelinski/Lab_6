package com.example.calculator;

import java.util.*;
public class Calculator {
    public int a, b;
    public double aDouble, bDouble;

    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int a:");
        this.a = scanner.nextInt();
        System.out.println("Enter int b:");
        this.b = scanner.nextInt();
        System.out.println("Enter double a:");
        this.aDouble = scanner.nextDouble();
        System.out.println("Enter double b:");
        this.bDouble = scanner.nextDouble();

    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double aDouble, double bDouble ) {
        return aDouble + bDouble;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public  double subtract(double aDouble, double bDouble) {
        return aDouble - bDouble;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double mulitiply(double aDouble, double bDouble) {
        return aDouble * bDouble;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Invalid second argument. do not divide by zero");
            return 0;
        }
    }

    public double divide(double aDouble, double bDouble) {
        if (b != 0) {
            return aDouble / bDouble;
        } else {
            System.out.println("Invalid second argument. do not divide by zero");
            return 0.0;
        }
    }

    public int compounding(int a, int b) { //Math.pow z java.util a podstawa b wykładnik tak samo w przypadku doubla [aDouble,bDouble]
        return (int) Math.pow(a, b);
    }

    public double compounding(double aDouble, double bDouble) {
        return Math.pow(aDouble, bDouble);
    }
}
