package com.workintech.company;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers; //JuniorDeveloper class tipinde oluşturulmuş array
    private MidDeveloper[] midDevelopers;//MidDeveloper class tipinde oluşturulmuş array
    private SeniorDeveloper[] seniorDevelopers;//SeniorDeveloper class tipinde oluşturulmuş array

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloperName){
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloperName;
                System.out.println("Junior Developer added: " + juniorDeveloperName);
            }else {
                System.out.println("Error: Junior Developers array is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Index not found"+ index);
        }

    }

    public void addEmployee(int index,MidDeveloper midDeveloperName){
       try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloperName;
                System.out.println("Mid Developer added: " + midDeveloperName);
            }else{
                System.out.println("Error: Mid Developers array is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
           ex.printStackTrace();
           System.out.println("Index not found"+ index);
       }

    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloperName){
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloperName;
                System.out.println("Senior Developer added: " + seniorDeveloperName);
            }else{
                System.out.println("Error: Senior Developers array is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Index not found" + index);
        }

    }

    @Override
    public void work() {
        //setSalary(60000);
        System.out.println(getName() + " hr manager starts to working");
    }

    @Override
    public String toString() {
        return super.toString() + "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
