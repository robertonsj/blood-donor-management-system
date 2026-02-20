## Blood Donor Management System

A Java project implementing an online blood bank that provides the blood 
donation service with a clean, well-structured design.

### Project Structure

src  
└── com  
└── yourname  
└── bloodbank  
├── 📁 model  
│   └── Donor.java  
├── 📁 service  
│   └── DonorService.java  
├── 📁 exception  
│   └── InvalidDonorDataException.java  
└── BloodBankApp.java

### ⚙️ Features
- Add a blood donor
- Validate donor information
- Custom exception for invalid data
- Display list of donors

### 🧩 Project Components
#### Donor (Model)
- Name
- Age
- Blood type
- Contact information

#### DonorService (Service Layer)
Responsible for:
- Adding donors
- Validating donor data
- Managing the donor list

#### InvalidDonorDataException
Custom exception used when donor data is invalid:
- Invalid age
- Missing name
- Incorrect blood type
- Phone number with 10+ digits 

#### BloodBankApp
Main class that runs the application and demonstrates the system functionality.

## Technologies
- Java
- JUnit
