
package com.mycompany.employeemanegment;
import java.util.HashSet;
import java.util.Objects;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}


public class EmployeeManegment {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Alice", 101));
        employees.add(new Employee("Bob", 102));
        employees.add(new Employee("Alice", 101));

        System.out.println("Employee records:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}


    
