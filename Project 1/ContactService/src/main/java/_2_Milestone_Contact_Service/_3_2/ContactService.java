package _2_Milestone_Contact_Service._3_2;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    // Store contacts using ContactID as key
    private Map<String, Contact> contacts = new HashMap<>();

    // Add a new contact if ContactID is unique
    public boolean addContact(Contact contact) {
        if (contact == null || contact.getContactID() == null) {
            throw new IllegalArgumentException("Contact or ContactID cannot be null");
        }
        if (contacts.containsKey(contact.getContactID())) {
            return false; // ContactID already exists
        }
        contacts.put(contact.getContactID(), contact);
        return true;
    }

    // Delete contact by ContactID
    public boolean deleteContact(String contactID) {
        if (contacts.containsKey(contactID)) {
            contacts.remove(contactID);
            return true;
        }
        return false; // ContactID not found
    }

    // Update contact fields by ContactID
    public boolean updateContact(String contactID, String newFirstName, String newLastName, String newNumber, String newAddress) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            return false; // ContactID not found
        }
        try {
            if (newFirstName != null) contact.setfirstName(newFirstName);
            if (newLastName != null) contact.setlastName(newLastName);
            if (newNumber != null) contact.setNumber(newNumber);
            if (newAddress != null) contact.setAddress(newAddress);
        } catch (IllegalArgumentException e) {
            return false; // Invalid input data
        }
        return true;
    }

    // Optional: get a contact by ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

    // Optional: generate a unique ID (example)
    public long generateUniqueID() {
        long min = 1_000_000_000L;
        long max = 9_999_999_999L;
        return min + (long) (Math.random() * (max - min + 1));
    }

    public static void main(String[] args) {
        // You can test ContactService here if needed
    }
}
