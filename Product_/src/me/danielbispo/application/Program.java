package me.danielbispo.application;

import me.danielbispo.entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();

        Product product = new Product(name, price);

        product.setName("computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
