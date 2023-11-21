package com.workintech.models;

public class Circle {
    private double radius;

    public void checkRadius(double radius){
        if (radius < 0){
            this.radius  = 0;
        }else {
            this.radius = radius;
        }
    }

    public Circle(double radius) {
        checkRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
