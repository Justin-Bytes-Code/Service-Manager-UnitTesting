package _1_Appointment_Service;

import java.util.HashMap;




public class AppointmentService {

	
    HashMap<String, Appointment> appointments = new HashMap<>();

    //Adds Appointment to Hashmap/Dictionary
    public void addAppointment(Appointment appt) {
        if (appointments.containsKey(appt.getAppointmentId())) {
            throw new IllegalArgumentException("id already exists");
        }

        appointments.put(appt.getAppointmentId(), appt);
    }

    //Deletes Appointment using an ID
    public void deleteAppointment(String id) {
        if (!appointments.containsKey(id)) {
            throw new IllegalArgumentException("id not found");
        }

        appointments.remove(id);
    }

    //Returns Appointment ID
    public Appointment getAppointment(String id) {
        return appointments.get(id);
    }
}
