package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{

    String name;
    double salary;
    String position;
    List<Employee> employeeList = new ArrayList<>();

    public Manager(String name, double salary, String position) {
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
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void print() {

        System.out.println("name: " + getName()
                + " | salary: " + getSalary()
                + " | position: " + getPosition());
        System.out.println("----------------------------------------------");

        Iterator<Employee> employeeIterator = employeeList.iterator();

        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }

}
