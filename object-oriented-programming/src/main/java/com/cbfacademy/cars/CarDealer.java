package com.cbfacademy.cars;

public class CarDealer {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porsche", "Panamera", 2009);
        Car car3 = new Car("Audi", "A3", 2018);
        System.out.println(car1.getMake());
        System.out.println(car2.getModel());
        System.out.println(car3);
    }
    
}
