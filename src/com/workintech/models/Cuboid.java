package com.workintech.models;

public class Cuboid extends Rectangle{
     private double height;

     public Cuboid(double width, double length, double height) {
          super(width, length);
          checkLength(height);
     }

     public double getHeight() {
          return height;
     }

     public double getVolume(){
          return getArea()*height;
     }

     @Override
     public String toString() {
          return "Cuboid{" +
                  "height=" + height +
                  '}';
     }
}
