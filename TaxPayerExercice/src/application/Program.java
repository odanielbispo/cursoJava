package application;

import entities.LegalEntity;
import entities.PhysicalPerson;
import entities.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Tax> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anual = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthTaxes = sc.nextDouble();
                list.add(new PhysicalPerson(name, anual, healthTaxes));
            }
            else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add(new LegalEntity(name, anual, employee));
            }
        }
        System.out.println();

        System.out.println("TAXES PAID: ");
        double total = 0;
        for (Tax tax : list){
            System.out.println(tax.getName() + ": $" + tax.tax());
            total += tax.tax();
        }
        System.out.println();
        System.out.println("Total taxes: $" + total);

        sc.close();
    }
}
