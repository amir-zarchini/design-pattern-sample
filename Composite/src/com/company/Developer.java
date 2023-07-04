package com.company;

import java.util.ArrayList;
import java.util.List;

public class Developer implements Employee{

    String name;
    double salary;
    String position;
    List<Employee> employeeList = new ArrayList<>();

    public Developer(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class
    }

    @Override
    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class
    }

    @Override
    public void print() {
        employeeList.forEach(employee -> {
            System.out.println("name: " + employee.getName()
                    + " | salary: " + employee.getSalary()
                    + " | position: " + employee.getPosition());
            System.out.println("----------------------------------------------");
        });
    }
}
