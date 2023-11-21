package com.workintech.company;

public class MidDeveloper  extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        //setSalary(40000);
        System.out.println(getName() + " mid developer starts to working");
    }
}
