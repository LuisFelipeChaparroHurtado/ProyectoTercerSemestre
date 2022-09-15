/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.Date;

public class Patient extends Person implements Comparable<Patient> {

    public static final int PATIENT_ENTRYTIME = 13;
    public static final int PATIENT_DEPARTURETIME = 14;
    public static final int PATIENT_DIAGNOSTIC = 15;
    public static final int PATIENT_DOCTOR = 16;
    public static final int PATIENT_NURSE = 17;
    public static final int PATIENT_ROOM = 18;

    private Date entryTime;
    private Date departureTime;
    private String diagnostic;
    private Doctor doctorPatient;
    private Nurse nursePatient;
    private Room roomPatient;

    public Patient(Date entryTime, Date departureTime, String diagnostic, Doctor doctorPatient, Nurse nursePatient, Room roomPatient, int id, String nameFirst, String lastFirst, Date birthDate, String city, String blooType, String gender) {
        super(id, nameFirst, lastFirst, birthDate, city, blooType, gender);
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.diagnostic = diagnostic;
        this.doctorPatient = doctorPatient;
        this.nursePatient = nursePatient;
        this.roomPatient = roomPatient;
    }

    public Patient() {
        super();
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Doctor getDoctorPatient() {
        return doctorPatient;
    }

    public void setDoctorPatient(Doctor doctorPatient) {
        this.doctorPatient = doctorPatient;
    }

    public Nurse getNursePatient() {
        return nursePatient;
    }

    public void setNursePatient(Nurse nursePatient) {
        this.nursePatient = nursePatient;
    }

    public Room getRoomPatient() {
        return roomPatient;
    }

    public void setRoomPatient(Room roomPatient) {
        this.roomPatient = roomPatient;
    }

    @Override
    public String toString() {
        return super.toString() + "Patient{" + "EntryTime=" + entryTime + ", DepartureTime=" + departureTime + ", Diagnostic=" + diagnostic + ", DoctorPatient=" + doctorPatient + ", NursePatient=" + nursePatient + ", RoomPatient=" + roomPatient + '}';
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        final Person toCompare = (Patient) obj;
        if (toCompare.getId() != this.id) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Patient o) {
        if (o.getId() == this.id) {
            return 1;

        } else if (nameFirst.toLowerCase().contains(o.getNameFirst().toLowerCase())) {
            return 1;
        }

        return 0;

    }

    public class SortByid implements Comparator<Patient> {

        @Override
        public int compare(Patient o1, Patient o2) {
            return o1.getNameFirst().compareTo(o2.getNameFirst());
        }
    }

}
