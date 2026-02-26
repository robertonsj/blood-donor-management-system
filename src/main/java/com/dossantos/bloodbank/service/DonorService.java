package main.java.com.dossantos.bloodbank.service;

import main.java.com.dossantos.bloodbank.exception.InvalidDonorDataException;
import main.java.com.dossantos.bloodbank.model.Donor;

import java.util.ArrayList;
import java.util.List;

public class DonorService {
    private List<Donor> donors = new ArrayList<>();

    public void addDonor(Donor donor) throws InvalidDonorDataException {
        validateDonor(donor);
        donors.add(donor);
    }
    public void validateDonor(Donor donor) throws InvalidDonorDataException{

        //Validate age
        if(donor.getAge() < 18 || donor.getAge() > 60) {
            throw new InvalidDonorDataException("Age must be between 18 and  60");
        }

        //Validate whether empty name
        if(donor.getName() == null || donor.getName().isEmpty()) {
            throw new InvalidDonorDataException("Name cannot be empty");
        }

        //Validate blood group
        if(!donor.getBloodGroup().matches("A|B|AB|O")) {
            throw new InvalidDonorDataException("Invalid blood group");
        }

        //Validate phone number (force size equal to 10)
        if(donor.getPhoneNumber().length() != 10) {
            throw new InvalidDonorDataException("Phone number must be 10 digits");
        }
    }

    public void displayDonors() {
        if(donors.isEmpty()) {System.out.println("No donors registered");}
        else {
            for(Donor donor : donors) {System.out.println(donor);}
        }
    }
}
