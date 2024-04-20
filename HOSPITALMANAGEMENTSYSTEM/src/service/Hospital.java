package service;

import entity.Doctor;
import entity.Patient;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void removePatient(String patientId) {
        // Implement removing a patient
    }

    public void updatePatient(String patientId, Patient updatedPatient) {
        // Implement updating patient information
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void removeDoctor(String doctorId) {
        // Implement removing a doctor
    }

    public void updateDoctor(String doctorId, Doctor updatedDoctor) {
        // Implement updating doctor information
    }

    public ArrayList<Doctor> searchDoctorBySpecialization(String specialization) {
        // Implement searching doctor by specialization
        return null;
    }

    public void displayAllPatients() {
        // Implement displaying all patients
    }

    public void displayAllDoctors() {
        // Implement displaying all doctors
    }
}