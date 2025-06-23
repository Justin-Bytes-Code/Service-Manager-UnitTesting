package _2_Milestone_Contact_Service._3_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test //Validates and creates a contact using constructor. 
    public void testValidContactCreation() {
        Contact contact = new Contact("Justin", "Perez", "1243 Main Street", "ContactID", "1234567890", 123456789L);
        assertEquals("Justin", contact.getfirstName());
        assertEquals("Perez", contact.getlastName());
        assertEquals("1243 Main Street", contact.getAddress());
        assertEquals("ContactID", contact.getContactID());
        assertEquals("1234567890", contact.getNumber());
        assertEquals(123456789L, contact.getUniqueID());
    }

    @Test //Validates setters and getters
    public void testSettersAndGetters() {
        Contact contact = new Contact("Name", "NotJohnson", "123 fake Street", "cID123", "9876543210", 987654321L);
        contact.setfirstName("Alice");
        contact.setlastName("Johnson");
        contact.setAddress("789 Oak Ave");
        // contact.setContactID("newID"); // ContactID is immutable, so avoid changing it
        contact.setNumber("5551234567");
        contact.setUniqueID(111222333L);

        assertEquals("Alice", contact.getfirstName());
        assertEquals("Johnson", contact.getlastName());
        assertEquals("789 Oak Ave", contact.getAddress());
        assertEquals("cID123", contact.getContactID()); // unchanged
        assertEquals("5551234567", contact.getNumber());
        assertEquals(111222333L, contact.getUniqueID());
    }

    @Test //Test name being wrong. 
    public void testInvalidFirstName() {
        Contact contact = new Contact("Valid", "Name", "Addr", "ID123", "1234567890", 123L);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contact.setfirstName("InvalidNameThatIsTooLong");
        });
        assertEquals("Invalid first name", exception.getMessage());
    }

}
