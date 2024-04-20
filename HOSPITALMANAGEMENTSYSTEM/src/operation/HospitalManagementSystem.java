package operation;

import entity.AppointmentRecord;
import entity.Doctor;
import entity.Patient;
import service.Appointment;
import service.Hospital;

import java.util.Date;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create objects of hospital, patient, doctor, and appointment
        Hospital hospital = new Hospital();
        Patient patient = new Patient("P001", "John Doe", 30, "Male", "1234567890");
        Doctor doctor = new Doctor("D001", "Dr. Smith", "General Physician", "9876543210");
        Appointment appointment = new Appointment();

        // Add patient and doctor to the hospital
        hospital.addPatient(patient);
        hospital.addDoctor(doctor);

        // Schedule an appointment
          Date appointmentDate = new Date(); // Set appointment date here
          appointment.scheduleAppointment(patient.getPatientId(), doctor.getDoctorId(), appointmentDate);

        // Display appointments by doctor
        System.out.println("Appointments for Doctor " + doctor.getDoctorName() + ":");
        for (AppointmentRecord record : appointment.displayAppointmentsByDoctor(doctor.getDoctorId())) {
            System.out.println(record);
        }

        // Cancel an appointment
         String appointmentId = ""; // Set appointmentId here
         appointment.cancelAppointment(appointmentId);

        // Display appointments by patient
        System.out.println("\nAppointments for Patient " + patient.getPatientName() + ":");
        for (AppointmentRecord record : appointment.displayAppointmentsByPatient(patient.getPatientId())) {
            System.out.println(record);
        }
    }
}
