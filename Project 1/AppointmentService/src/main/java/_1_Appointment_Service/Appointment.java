package _1_Appointment_Service;

import java.util.Date;


//
/*
 * Justin Perez
 * 
 * Note: This does not have any Cleaning aside from length so it's weak to Injections
 * 
 */





public class Appointment {

    //Fields
    private final String appointmentId;
    private final Date appointmentDate;
    private final String description;

    //Constructor
    public Appointment(String appointmentId, Date appointmentDate, String description) {

        //ID Verification 
        if (appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("appointment ID is bad");
        }

        //Date Verification 
        if (appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("date is in the past or null");
        }

        //Description Verification
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("description is too long or null");
        }

        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    //Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {
        return description;
    }
}
