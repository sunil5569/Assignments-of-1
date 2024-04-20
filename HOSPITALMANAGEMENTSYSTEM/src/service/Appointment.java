package service;

import entity.AppointmentRecord;

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    private ArrayList<AppointmentRecord> appointments;

    public Appointment() {
        appointments = new ArrayList<>();
    }

    public void scheduleAppointment(String patientId, String doctorId, Date appointmentDate) {
        // Implement appointment scheduling
    }

    public void cancelAppointment(String appointmentId) {
        // Implement appointment cancellation
    }

    public ArrayList<AppointmentRecord> displayAppointmentsByDoctor(String doctorId) {
        ArrayList<AppointmentRecord> appointmentsByDoctor = new ArrayList<>();
        for (AppointmentRecord record : appointments) {
            if (record.getDoctorId().equals(doctorId)) {
                appointmentsByDoctor.add(record);
            }
        }
        return appointmentsByDoctor;
    }

    public ArrayList<AppointmentRecord> displayAppointmentsByPatient(String patientId) {
        ArrayList<AppointmentRecord> appointmentsByPatient = new ArrayList<>();
        for (AppointmentRecord record : appointments) {
            if (record.getPatientId().equals(patientId)) {
                appointmentsByPatient.add(record);
            }
        }
        return appointmentsByPatient;
    }

}
