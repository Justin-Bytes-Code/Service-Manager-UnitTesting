package _1_Appointment_Service;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    //Makes a Date
    public Date makeFutureDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    //Test if appointments work with proper Information
    @Test
    public void testAppointmentWorks() {
        Date future = makeFutureDate();
        Appointment appt = new Appointment("145", future, "my Appointment");

        assertEquals("145", appt.getAppointmentId());
        assertEquals(future, appt.getAppointmentDate());
        assertEquals("my Appointment", appt.getDescription());
    }

    //If the Appointment is empty it will throw an error
    @Test
    public void testNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, makeFutureDate(), "test");
        });
    }

    //Test if it throws an error when putting a ID longer then 10 characters. 
    @Test
    public void testTooLongId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678910", makeFutureDate(), "test");
        });
    }

    //Checks if  null date throws an error 
    @Test
    public void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123", null, "test");
        });
    }

    //Checks if date in the past throws an error 
    @Test
    public void testPastDate() {
        Date past = new Date(System.currentTimeMillis() - 1000);
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123", past, "test");
        });
    }

    //Check if the Description is null. If it is it will throw an error. 
    @Test
    public void testNullDesc() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123", makeFutureDate(), null);
        });
    }

    //Check if Description is longer then 50 Characters
    @Test
    public void testTooLongDesc() {
        String bigDesc = "this is a description that goes way past fifty characters";
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("123", makeFutureDate(), bigDesc);
        });
    }
}
