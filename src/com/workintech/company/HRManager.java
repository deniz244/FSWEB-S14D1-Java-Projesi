package com.workintech.company;

public class HRManager extends Employee {
    private String[] juniorDevelopers;
    private String[] midDevelopers;
    private String[] seniorDevelopers;

    public HRManager(long id, String name, double salary, String[] juniorDevelopers,
                     String[] midDevelopers, String[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public String[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public String[] getMidDevelopers() {
        return midDevelopers;
    }

    public String[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void addEmployee(String juniorDeveloperName,String midDeveloperName){
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloperName;
                System.out.println("Junior Developer added: " + juniorDeveloperName);
            }
        }
        System.out.println("Error: Junior Developers array is full.");

        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloperName;
                System.out.println("Mid Developer added: " + midDeveloperName);
            }
        }
        System.out.println("Error: Mid Developers array is full.");
    }

    public void addEmployee(String seniorDeveloperName){
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloperName;
                System.out.println("Senior Developer added: " + seniorDeveloperName);
            }
        }
        System.out.println("Error: Senior Developers array is full.");
    }

    public void work(){
        System.out.println("Developer starts to working");
    }

}
