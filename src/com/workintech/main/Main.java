package com.workintech.main;

import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Circle;
import com.workintech.pool.Cuboid;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------Silindir için------");
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("--------Havuz alanı için-------");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("---------Employee için------------");

        JuniorDeveloper junior1 = new JuniorDeveloper(1,"Ali",20000);
        JuniorDeveloper junior2 = new JuniorDeveloper(2,"Veli",250000);
        junior1.work();
        junior2.work();
        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(1,"Ahmet",30000);
        MidDeveloper mid2 = new MidDeveloper(2,"Ayşe",350000);
        mid1.work();
        mid2.work();
        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper senior = new SeniorDeveloper(1,"Mustafa",40000);

        HRManager hrManager = new HRManager(6,"Deniz", 55000,
                new JuniorDeveloper[5],
                new MidDeveloper[2],new SeniorDeveloper[1]);

        hrManager.work();
        hrManager.addEmployee(0,junior1);
        hrManager.addEmployee(1,junior2);
        hrManager.addEmployee(0,mid1);
        hrManager.addEmployee(1,mid2);
        hrManager.addEmployee(0,senior);
        System.out.println(hrManager);
    }
}