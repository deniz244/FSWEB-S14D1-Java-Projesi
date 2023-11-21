package com.workintech.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(){
        System.out.println("Junior Developer starts to working");
    }
}
