package com.company;

public interface Employee {

    String getName();
    double getSalary();
    String getPosition();
    void add(Employee employee);
    void remove(Employee employee);
    void print();

}
