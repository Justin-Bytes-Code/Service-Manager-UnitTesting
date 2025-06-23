package _2_Milestone_Contact_Service._3_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService service;
    private Contact contact;

    //Test setup 
    @BeforeEach
    public void setUp() {
        service = new ContactService();
        contact = new Contact("John", "Smith", "101 Main St", "ID123", "1234567890", service.generateUniqueID());
    }

    //Double check if it's added
    @Test
    public void testAddContactSuccess() {
        boolean added = service.addContact(contact);
        assertTrue(added);
        assertEquals(contact, service.getContact("ID123"));
    }

    // Ensures that you can't duplicate 
    @Test
    public void testAddDuplicateContactFails() {
        service.addContact(contact);
        Contact duplicate = new Contact("Person", "Last", "323 Fake Adress", "ID123", "0987654321", service.generateUniqueID());
        boolean added = service.addContact(duplicate);
        assertFalse(added); // same ContactID
    }

    //Delete contact
    @Test
    public void testDeleteContactSuccess() {
        service.addContact(contact);
        boolean deleted = service.deleteContact("ID123");
        assertTrue(deleted);
        assertNull(service.getContact("ID123"));
    }

    //Checks to see if contact is valid. If it's not then it's not found
    @Test
    public void testDeleteContactFailsIfNotFound() {
        boolean deleted = service.deleteContact("NOT_FOUND");
        assertFalse(deleted);
    }

    //Update contacts was Successful
    @Test
    public void testUpdateContactSuccess() {
        service.addContact(contact);
        boolean updated = service.updateContact("ID123", "Name", "Last", "5556667777", "232 Fake Road");
        assertTrue(updated);
        assertEquals("Name", service.getContact("ID123").getfirstName());
        assertEquals("Last", service.getContact("ID123").getlastName());
        assertEquals("5556667777", service.getContact("ID123").getNumber());
        assertEquals("232 Fake Road", service.getContact("ID123").getAddress());
    }

    //update fails for invalid IDS. 
    @Test
    public void testUpdateContactFailsIfNotFound() {
        boolean updated = service.updateContact("BAD_ID", "FAIL", "2ND FAIL", "5556667777", "303 Pine Rd");
        assertFalse(updated);
    }

    //Update fails for bad data
    @Test
    public void testUpdateContactFailsWithInvalidData() {
        service.addContact(contact);
        boolean updated = service.updateContact("ID123", null, null, "bad", null); // bad phone
        assertFalse(updated);
    }
}
