package com.company;

public class EmployeeFullTime {
    private String name;
    private double salary;

//getter setters constructors

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

