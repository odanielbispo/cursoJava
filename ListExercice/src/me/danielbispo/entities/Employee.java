package me.danielbispo.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;
    }
}
