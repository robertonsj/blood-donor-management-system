package main.java.com.dossantos.blooddonor;

import java.util.Scanner;

public class DonorUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte option;

        do {
            System.out.println("### Online Donor Registration ###" +
                    "\n1. Adding a donor" +
                    "\n2. Display all donors" +
                    "\n3. Exit de Application" +
                    "\nEnter a choice: ");
            option = scanner.nextByte();

            switch (option) {
                case 1:
                    System.out.println("Donor added");
                    break;
                case 2:
                    System.out.println("All donors displayed");
                    break;
                case 3:
                    System.out.println("You signed out");
                    break;
                default:
                    System.err.println("Invalid choice!");
            }

        } while (option != 3);

    }
}
