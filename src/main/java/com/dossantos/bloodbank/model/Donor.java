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

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;}

    public String getBloodGroup() { return bloodGroup; }

    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getName() { return name;}

    public void setName(String lastName) { this.name = name; }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Blood Group: " + bloodGroup +
                ", Age: " + age +
                ", Phone: " + phoneNumber;
    }
}
