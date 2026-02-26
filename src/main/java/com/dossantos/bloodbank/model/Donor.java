package main.java.com.dossantos.bloodbank.model;

public class Donor {
    private String name;
    private String bloodGroup;
    private String phoneNumber;
    private int age;

    public Donor(String name, String bloodGroup,
                 String phoneNumber, int age) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getPhoneNumber() { return phoneNumber; }


    public String getBloodGroup() { return bloodGroup; }


    public int getAge() { return age; }


    public String getName() { return name;}


    @Override
    public String toString() {
        return "Name: " + name +
                ", Blood Group: " + bloodGroup +
                ", Age: " + age +
                ", Phone: " + phoneNumber;
    }
}
