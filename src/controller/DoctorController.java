/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Doctor;
import model.Employee;
import model.Person;

public class DoctorController extends AbstractFacade<Doctor> {

    public DoctorController() {
        try{
        data = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy/HH:mm");
        data.add(new Doctor("Pediatra", 1, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 14, "Luis Felipe", "Chaparro", format.parse("12/20/2000/12:40"), "Sogamoso", "A+", "Masculino"));
        data.add(new Doctor("Medicina General", 3, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 12, "Carlos", "Perez", format.parse("12/20/2000/12:40"), "Sogamoso", "A-", "Masculino"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    public boolean save(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy/HH:mm");
            Doctor newDoctor = new Doctor(
                    args[Doctor.DOCTOR_SPECIALTY],
                    Double.parseDouble(args[Employee.EMPLOYEE_SALARY]),
                    args[Employee.EMPLOYEE_TURN],
                    format.parse(args[Employee.EMPLOYEE_STARTDATEWORK]),
                    format.parse(args[Employee.EMPLOYEE_ENDDATEWORK]),
                    Integer.parseInt(args[Person.PERSON_ID]),
                    args[Person.PERSON_NAMEFIRST],
                    args[Person.PERSON_LASTFIRST],
                    format.parse(args[Person.PERSON_BIRTHDATE]),
                    args[Person.PERSON_CITY],
                    args[Person.PERSON_BLOOTYPE],
                    args[Person.PERSON_GENDER]);

            create(newDoctor);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public void sort() {
        //Object to set current department
        Doctor doc = new Doctor();

        //Order list by selected rule
        data.sort(doc.new SortByid());
    }

    public String filterResults(String[] args) {

        //New List to add filtered objects
        List<Doctor> filterList = new ArrayList<>();

        //Object to set current doctor
        Doctor toCompare = new Doctor(
                args[Doctor.DOCTOR_SPECIALTY],
                Double.parseDouble(args[Employee.EMPLOYEE_SALARY]),
                args[Employee.EMPLOYEE_TURN],
                null,
                null,
                Integer.parseInt(args[Person.PERSON_ID]),
                args[Person.PERSON_NAMEFIRST],
                args[Person.PERSON_LASTFIRST],
                null,
                args[Person.PERSON_CITY],
                args[Person.PERSON_BLOOTYPE],
                args[Person.PERSON_GENDER]);

        for (Object object : data) {
            //Object to set current doctor
            Doctor current = (Doctor) object;
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
