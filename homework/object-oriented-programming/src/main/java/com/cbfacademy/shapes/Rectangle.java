package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    public double length;

    public double width;


    public static void main(String[] args) {
        Shape s1 = new Rectangle("rectangle",2.3,3.7);
        System.out.println(s1.toString());
    }


        public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }


        @Override
        public double area() {
            double area = this.length*this.width;
            return area;
        }



        @Override
        public String toString() {
            return "Rectangle";
        }

        
}
    
    
