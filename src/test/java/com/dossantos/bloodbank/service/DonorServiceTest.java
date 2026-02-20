package test.java.com.dossantos.bloodbank.service;
import main.java.com.dossantos.bloodbank.service.DonorService;
import main.java.com.dossantos.bloodbank.exception.InvalidDonorDataException;
import main.java.com.dossantos.bloodbank.model.Donor;

public class DonorServiceTest {
    public static void main(String[] args) {
        DonorService service = new DonorService();

        try {
            Donor donor1 = new Donor("John", "A","1234567890", 25);
            service.addDonor(donor1);

            Donor donor2 = new Donor("Mary", "B", "1234567890", 19);
            service.addDonor(donor2);  // Should throw exception

            Donor donor3 = new Donor("Peter", "C", "1234567890", 35);
            service.addDonor(donor3);

        } catch (InvalidDonorDataException e) {
            System.err.println("Validation Error. " + e.getMessage());
        }

        service.displayDonors();
    }
}
