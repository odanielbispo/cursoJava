package me.danielbispo.application;

import me.danielbispo.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

//        Employee[] employee = new Employee[n];

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();


            Employee emp = new Employee(id, name, salary);

            list.add(emp);
            System.out.println();
        }

        sc.close();
    }
}
