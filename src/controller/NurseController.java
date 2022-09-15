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
import model.Employee;
import model.Nurse;
import model.Person;

public class NurseController extends AbstractFacade<Nurse> {

    public NurseController() {
        try {
            data = new ArrayList<>();
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy/HH:mm");
            data.add(new Nurse("Enfermera de turno", 1000000, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 1, "Natalia", "Gonzalez", format.parse("12/20/2000/12:40"), "Duitama", "O+", "Femenino"));
            data.add(new Nurse("Enfermera de turno", 1000000, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 1, "Hola", "Arias", format.parse("12/20/2000/12:40"), "Duitama", "O+", "Femenino"));
            data.add(new Nurse("Enfermera de turno", 1000000, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 1, "Camila", "Gonzalez", format.parse("12/20/2000/12:40"), "Duitama", "O+", "Femenino"));
            data.add(new Nurse("Jefe de enfermeras", 2000000, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 4, "Maria", "Acevedo", format.parse("12/20/2000/12:40"), "Duitama", "O+", "Femenino"));
            data.add(new Nurse("Jefe de enfermeras", 1800000, "6 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 2, "Angie", "Quintero", format.parse("12/20/2000/12:40"), "Duitama", "O+", "Femenino"));
            data.add(new Nurse("Enfermera de medicina general", 5000000, "12 horas", format.parse("12/20/2000/12:40"), format.parse("12/20/2000/12:40"), 10, "Carolina", "Soto", format.parse("12/20/2000/12:40"), "Sogamoso", "A-", "Femenino"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean save(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy/HH:mm:ss");
            Nurse newNurse = new Nurse(
                    args[Nurse.NURSE_TYPELABORS],
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

            create(newNurse);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public void sort() {
        //Object to set current department
        Nurse nur = new Nurse();

        //Order list by selected rule
        data.sort(nur.new SortById());
    }

    public String filterResults(String[] args) {

        //New List to add filtered objects
        List<Nurse> filterList = new ArrayList<>();

        //Object to set current nurse
        Nurse toCompare = new Nurse(
                args[Nurse.NURSE_TYPELABORS],
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
            //Object to set current nurse
            Nurse current = (Nurse) object;
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
