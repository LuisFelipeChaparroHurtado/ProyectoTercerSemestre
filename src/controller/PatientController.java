/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Doctor;
import model.Nurse;
import model.Patient;
import model.Person;
import model.Room;

public class PatientController extends AbstractFacade<Patient> {

    public PatientController() {
        data = new ArrayList<>();
    }

    public boolean save(String[] args, Object[] object) {
        try {

            Patient newPatient = new Patient(
                    null,
                    null,
                    args[Patient.PATIENT_DIAGNOSTIC],
                    
                    (Doctor) (object[Patient.PATIENT_DOCTOR]),
                    (Nurse) (object[Patient.PATIENT_NURSE]),
                    (Room) (object[Patient.PATIENT_ROOM]),
                    
                    Integer.parseInt(args[Person.PERSON_ID]),
                    args[Person.PERSON_NAMEFIRST],
                    args[Person.PERSON_LASTFIRST],
                    null,
                    args[Person.PERSON_CITY],
                    args[Person.PERSON_BLOOTYPE],
                    args[Person.PERSON_GENDER]);

            create(newPatient);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public void sort() {
        //Object to set current department
        Patient patient = new Patient();

        //Order list by selected rule
        data.sort(patient.new SortByid());
    }

    public String filterResults(String[] args, Object[] object) {

        //New List to add filtered objects
        List<Patient> filterList = new ArrayList<>();

        //Object to set current patient
        Patient toCompare = new Patient(
                null,
                null,
                args[Patient.PATIENT_DIAGNOSTIC],
                
                (Doctor) (object[Patient.PATIENT_DOCTOR]),
                (Nurse) (object[Patient.PATIENT_NURSE]),
                (Room) (object[Patient.PATIENT_ROOM]),
                
                Integer.parseInt(args[Person.PERSON_ID]),
                args[Person.PERSON_NAMEFIRST],
                args[Person.PERSON_LASTFIRST],
                null,
                args[Person.PERSON_CITY],
                args[Person.PERSON_BLOOTYPE],
                args[Person.PERSON_GENDER]);

        for (Object obj : data) {
            //Object to set current departament
            Patient current = (Patient) obj;
            //Comapare Objects
            if (current.getId() == toCompare.getId()) {
                filterList.add(current);
            } else if (current.getNameFirst() == toCompare.getNameFirst()) {
                filterList.add(current);
            }
        }
        return Arrays.toString(filterList.toArray());
    }

}
