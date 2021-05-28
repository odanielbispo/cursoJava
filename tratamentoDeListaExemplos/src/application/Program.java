package application;

import entities.Employee;

import java.sql.SQLOutput;
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

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idSalary = sc.nextInt();

        Integer pos = position(list, idSalary);
        //Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(pos == null){
            System.out.println("This ID doesn't exist!");
        }
        else {
            System.out.print("Ener the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++){
            //se meu list.get (funcao que pega o elemento na posicao i) na posicao i
            // .getId(): se ele for igual ao id que estou usando como parametro
            //entao encontrei o id na lista, entao quer dizer que a posicao dele é i
            //entao vou retornar i
            if (list.get(i).getId() == id ){
                return i;
            }
        }
        return null;
    }
}
