package _1_Appointment_Service;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {

    //Makes a date in the future
    public Date getFutureDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    //Adds an appointment then checks the information
    @Test
    public void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appt = new Appointment("1", getFutureDate(), "something");
        service.addAppointment(appt);
        assertEquals(appt, service.getAppointment("1"));
    }

    //Testing adding 2 appointments of the same ID. It should throw an error. 
    @Test
    public void testDuplicateAdd() {
        AppointmentService service = new AppointmentService();
        Appointment one = new Appointment("2", getFutureDate(), "first");
        Appointment two = new Appointment("2", getFutureDate(), "second");
        service.addAppointment(one);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(two);
        });
    }

    //Deletes a appointment properly to see if it works. 
    @Test
    public void testDelete() {
        AppointmentService service = new AppointmentService();
        Appointment appt = new Appointment("3", getFutureDate(), "bye");
        service.addAppointment(appt);
        service.deleteAppointment("3");
        assertNull(service.getAppointment("3"));
    }

    //Tries to delete a appointment that isn't made. SHOULD give an error. 
    @Test
    public void testDeleteNotThere() {
        AppointmentService service = new AppointmentService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("404"); //ID doesn't exist
        });
    }
}
