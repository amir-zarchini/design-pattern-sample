package com.company;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee emp1 = new Developer("dev1", 10000, "DEVELOPER");
        Employee emp2 = new Developer("dev2", 15000, "DEVELOPER");
        Employee manager1 = new Manager("manager1",25000, "MANAGER");

        // add subordinates
        manager1.add(emp1);
        manager1.add(emp2);


        Employee emp3 = new Developer("dev3", 20000, "DEVELOPER");
        Manager generalManager = new Manager("generalManager", 50000, "MANAGER");

        // add subordinates for generalManager
        generalManager.add(emp3);
        generalManager.add(manager1);

        System.out.println("generalManager: ");
        generalManager.print();

        System.out.println("manager: ");
        manager1.print();
    }
}
