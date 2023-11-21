package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be ranted? ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        for (int i=0;i<10;i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        System.out.println("Enter the room number you want to update: ");
        int roomToUpdate = sc.nextInt();

        if (vect[roomToUpdate] != null) {
            vect[roomToUpdate].updateNameAndEmail();
            System.out.println("Updated information for room " + roomToUpdate + ": " + vect[roomToUpdate].getNameAndEmail());
        } else {
            System.out.println("Room " + roomToUpdate + " is not rented.");
        }


        sc.close();
    }

}
