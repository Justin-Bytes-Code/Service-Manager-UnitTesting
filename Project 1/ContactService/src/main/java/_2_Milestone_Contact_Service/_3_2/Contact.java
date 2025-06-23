package _2_Milestone_Contact_Service._3_2;
//import java.util.Scanner; //scanner

/** Justin Perez
 * 
 * Complete refactor of 3-2
 *  
 * 
 * 
 * 
 * 
 */

public class Contact {
    
    //Variables for checking
    public String NameCheck; 
    public String PhoneCheck;
    public String ContactIDcheck;
    public String AddressCheck;
    public Integer Verified;

    // Contact Information
    private String firstName;
    private String lastName;
    private String Address;
    private String ContactID;
    private String Number;  // Phone number as String to hold 10 digits exactly

    // Randomly Generated
    private long UniqueID;

    // Constructor
    public Contact(String firstName, String lastName, String Address, String ContactID , String Number, long UniqueID) {
        setfirstName(firstName);
        setlastName(lastName);
        setAddress(Address);
        setContactID(ContactID);
        setNumber(Number);
        setUniqueID(UniqueID);
    }

    // Setters with validation

    public void setfirstName(String firstName) {
        if (firstName == null || firstName.length() > 10 || !firstName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        if (lastName == null || lastName.length() > 10 || !lastName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public void setAddress(String Address) {
        if (Address == null || Address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.Address = Address;
    }

    public void setContactID(String ContactID) {
        if (ContactID == null || ContactID.length() > 10 || !ContactID.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Invalid ContactID");
        }
        // ContactID should not be changed once set, so optionally add a guard here if needed.
        this.ContactID = ContactID;
    }

    public void setNumber(String Number) {
        if (Number == null || !Number.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.Number = Number;
    }

    public void setUniqueID(long UniqueID) {
        if (UniqueID <= 0) {
            throw new IllegalArgumentException("Invalid UniqueID");
        }
        this.UniqueID = UniqueID;
    }

    // Getters
    String getfirstName() {
        return this.firstName;
    }

    String getlastName() {
        return this.lastName;
    }

    String getAddress() {
        return this.Address;
    }

    String getContactID() {
        return this.ContactID;
    }

    String getNumber() {
        return this.Number;
    }

    long getUniqueID() {
        return this.UniqueID;
    }

    // Validates Name (example, but not used actively)
    public String VerifiedNameCheck() {
        
        while (true) {
            if (!NameCheck.isEmpty() 
                    && NameCheck.matches("[a-zA-Z]+") 
                    && NameCheck.length() < 10) 
                break;
            System.out.println("First name must only contain letters and not be empty or exceed 10 letters.");
        }
        return NameCheck;
    }
    
    // Other validation methods can remain, but your setters already validate inputs.
}
