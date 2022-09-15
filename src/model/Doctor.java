/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.Date;

public class Doctor extends Employee implements Comparable<Doctor> {

    private String specialty;

    public static final int DOCTOR_SPECIALTY = 11;

    public Doctor(String specialty, double salary, String turn, Date startDateWork, Date endDateWork, int id, String nameFirst, String lastFirst, Date birthDate, String city, String blooType, String gender) {
        super(salary, turn, startDateWork, endDateWork, id, nameFirst, lastFirst, birthDate, city, blooType, gender);
        this.specialty = specialty;
    }

    public Doctor() {
        super();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        //return super.toString() + "\n          " + "Doctor{" + "Specialty=" + specialty + "}";
        return "\n* "+nameFirst + " "+lastFirst;
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

        final Person toCompare = (Doctor) obj;
        if (toCompare.getId() != this.id) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Doctor o) {
        if (o.getId() == this.id) {
            return 1;

        } else if (nameFirst.toLowerCase().contains(o.getNameFirst().toLowerCase())) {
            return 1;
        }

        return 0;
    }

    public class SortByid implements Comparator<Doctor> {

        @Override
        public int compare(Doctor o1, Doctor o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }

    public class SortByName implements Comparator<Doctor> {

        @Override
        public int compare(Doctor o1, Doctor o2) {
            return o1.getNameFirst().compareTo(o2.getNameFirst());

        }
    }
}
