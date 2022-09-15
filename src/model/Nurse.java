/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.Date;

public class Nurse extends Employee implements Comparable<Nurse> {

    public static final int NURSE_TYPELABORS = 11;
    protected String typeLabors;

    public Nurse() {
        super();
    }

    public Nurse(String typeLabors, double salary, String turn, Date startDateWork, Date endDateWork, int id, String nameFirst, String lastFirst, Date birthDate, String city, String blooType, String gender) {
        super(salary, turn, startDateWork, endDateWork, id, nameFirst, lastFirst, birthDate, city, blooType, gender);
        this.typeLabors = typeLabors;
    }

    public String getTypeLabors() {
        return typeLabors;
    }

    public void setTypeLabors(String typeLabors) {
        this.typeLabors = typeLabors;
    }

    @Override
    public String toString() {
        //return super.toString() + "\n          " + "Nurse{" + "TypeLabors=" + typeLabors + '}';
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

        final Person toCompare = (Nurse) obj;
        if (toCompare.getId() != this.id) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Nurse o) {
        if (o.getId() == this.id) {
            return 1;

        } else if (nameFirst.toLowerCase().contains(o.getNameFirst().toLowerCase())) {
            return 1;
        }

        return 0;
    }

    public class SortById implements Comparator<Nurse> {

        @Override
        public int compare(Nurse o1, Nurse o2) {
            return o1.getId().compareTo(o2.getId());
        }

    }

    public class SortByName implements Comparator<Nurse> {

        @Override
        public int compare(Nurse o1, Nurse o2) {
            return o1.getNameFirst().compareTo(o2.getNameFirst());

        }
    }
}
