package com.cbfacademy.shapes;

public abstract class Shape {
    public String shapeName;
    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Shape" +
                "shapeName='" + shapeName;
                
    }
}
