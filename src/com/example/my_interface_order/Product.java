package com.example.my_interface_order;

public class Product implements Order{
    private String name;
    private double price;

    public Product (String name, double price ) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double  calculatePrice(){
        return price;
    }

    @Override
    public void showDetail() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price) ;
    }
}
