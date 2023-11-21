package com.workintech.models;

public class Rectangle {

    private double width;
    private double length;

    public void checkWidth(double width){
        if (width < 0 ){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void checkLength(double length){
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public Rectangle(double width, double length) {
        checkWidth(width);
        checkLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
