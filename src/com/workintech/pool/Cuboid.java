package com.workintech.pool;
public class Cuboid extends Rectangle {
     private double height;

     public Cuboid(double width, double length, double height) {
          super(width, length);//önce rectangle olmanın kuralını yerine getirmeli -- this.height önce olmamalı
          this.height = height < 0 ? 0 : height;
     }

     public double getHeight() {
          return height;
     }

     public double getVolume(){
          return height*getArea();
     }

     @Override
     public String toString() {
          return "Cuboid{" +
                  "height=" + height +
                  '}';
     }
}
