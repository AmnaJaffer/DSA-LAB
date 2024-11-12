package com.mycompany.employeesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    int empId;
    String empName;
    String empGender;
    int yearOfJoining;

    public Employee(int empId, String empName, 
            String empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.yearOfJoining, e.yearOfJoining);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}

public class EmployeeSort{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "Female", 2018));
        employees.add(new Employee(102, "Bob", "Male", 2020));
        employees.add(new Employee(103, "Charlie", "Male", 2015));

        Collections.sort(employees);

        System.out.println("Employees sorted by joining year:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
