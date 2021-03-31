package me.danielbispo.application;

import me.danielbispo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("First grade: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Second grade: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Third grade: ");
        student.grade3 = sc.nextDouble();
        System.out.println();


        System.out.println(student.calc());
    }
}
