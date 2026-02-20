package main.java.com.dossantos.bloodbank;
import main.java.com.dossantos.bloodbank.model.Donor;
import java.util.Scanner;

public class BloodBankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte option;

        Donor donor = new Donor(
                "dos Santos",
                "O+",
                "86-98154",
                20
        );

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
                    System.out.println(donor);
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
