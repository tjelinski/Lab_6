package com.example.my_interface_order;

public class Service implements Order{
    private  String name;
    private  double pricePerhour;
    private double howManyhour;

    public  Service(String name, double pricePerhour, double howManyhour) {
        this.name = name;
        this.pricePerhour = pricePerhour;
        this.howManyhour = howManyhour;
    }

    @Override
    public  double calculatePrice(){
        return pricePerhour * howManyhour;
    }

    @Override
    public void showDetail(){
        System.out.println("Service: " + name);
        System.out.println("Price by haour: " + pricePerhour);
        System.out.println("Number of hour: " + howManyhour);
    }
}
