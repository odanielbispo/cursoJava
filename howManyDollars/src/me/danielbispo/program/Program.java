package me.danielbispo.program;

import me.danielbispo.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice, howMany;

        System.out.print("What is the dollar price?: ");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?: ");
        howMany = sc.nextDouble();

        double result = CurrencyConverter.convert(dollarPrice, howMany);

        System.out.printf("Amount to be paid in reais = %.2f" , result);

        sc.close();
    }
}
