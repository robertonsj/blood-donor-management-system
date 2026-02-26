package main.java.com.dossantos.bloodbank;
import main.java.com.dossantos.bloodbank.exception.InvalidDonorDataException;
import main.java.com.dossantos.bloodbank.model.Donor;
import main.java.com.dossantos.bloodbank.service.DonorService;

import java.util.Scanner;

public class BloodBankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DonorService service = new DonorService();

        while(true) {

            System.out.println("\n=== Online Donor Registration ###" +
                    "\n1. Add Donor" +
                    "\n2. Display Donors" +
                    "\n3. Exit");
            byte option = Byte.parseByte(scanner.nextLine());

            switch (option) {
                case 1:
                    try {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter blood group (A, B, AB, O): ");
                        String bloodGroup = scanner.nextLine();

                        System.out.print("Enter phone: ");
                        String phone = scanner.nextLine();

                        Donor donor = new Donor(name, bloodGroup, phone, age);
                        service.addDonor(donor);

                        System.out.println("Donor added successfully!");

                    } catch (InvalidDonorDataException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    service.displayDonors();
                    break;
                case 3:
                    System.out.println("Exiting system");
                    return;
                default:
                    System.err.println("Invalid choice.");
            }
        }

    }
}
