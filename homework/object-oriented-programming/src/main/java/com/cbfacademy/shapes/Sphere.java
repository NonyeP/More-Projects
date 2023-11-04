package com.cbfacademy.shapes;

public class Sphere extends Shape {
   public double radius;

    @Override
    public double area() {
        double area = 4*Math.pow(Math.PI, 2);
        return area;
    }
    
    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
    
}
