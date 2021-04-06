package application;

import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rooms[] vect = new Rooms[10];

        for (int i = 0; i < n; i++){
            sc.nextLine();

            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room - 1] = new Rooms(name, email, room);
            System.out.println();
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }

    }
}
