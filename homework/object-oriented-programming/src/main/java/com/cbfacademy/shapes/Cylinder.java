package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    public double height;
    public double radius;


    public Cylinder(String shapeName, double height, double radius) {
        super(shapeName);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = height*radius;
        return area;
    }

    public static void main(String[] args) {
        int[] A = new int[4];
        A[0] = 0;
        

        Shape sd = new Rectangle("Rectangle",2.3,24);
        System.out.println(sd.area());
    }

    @Override
    public String toString() {
        return "Cylinder ";
    }

    
}

