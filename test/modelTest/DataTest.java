/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;

import controller.DoctorController;
import controller.NurseController;
import java.util.Arrays;
import model.Doctor;
import model.Employee;
import model.Nurse;
import model.Person;

/**
 *
 * @author Felipe Chaparro
 */
public class DataTest {

    public static void main(String[] args) {

        //NURSE TESTS
        NurseController nurse = new NurseController();

        //DATA
        String[] Nurse1 = new String[12];
        Nurse1[Nurse.NURSE_TYPELABORS] = "Enfermera Medicina General";
        Nurse1[Employee.EMPLOYEE_SALARY] = "3000";
        Nurse1[Employee.EMPLOYEE_TURN] = "Nocturno";
        Nurse1[Employee.EMPLOYEE_STARTDATEWORK] = "11/02/2020/12:00";
        Nurse1[Employee.EMPLOYEE_ENDDATEWORK] = "11/02/2020/12:00";
        Nurse1[Person.PERSON_ID] = "4";
        Nurse1[Person.PERSON_NAMEFIRST] = "Maria";
        Nurse1[Person.PERSON_LASTFIRST] = "Hurtado";
        Nurse1[Person.PERSON_BIRTHDATE] = "11/02/2020/12:00";
        Nurse1[Person.PERSON_BLOOTYPE] = "A-";
        Nurse1[Person.PERSON_GENDER] = "Femenina";

        String[] Nurse2 = new String[12];
        Nurse2[Nurse.NURSE_TYPELABORS] = "Enfermera Medicina General";
        Nurse2[Employee.EMPLOYEE_SALARY] = "3000";
        Nurse2[Employee.EMPLOYEE_TURN] = "Nocturno";
        Nurse2[Employee.EMPLOYEE_STARTDATEWORK] = "11/02/2020/12:00";
        Nurse2[Employee.EMPLOYEE_ENDDATEWORK] = "11/02/2020/12:00";
        Nurse2[Person.PERSON_ID] = "2";
        Nurse2[Person.PERSON_NAMEFIRST] = "Santiago";
        Nurse2[Person.PERSON_LASTFIRST] = "Cardenas";
        Nurse2[Person.PERSON_BIRTHDATE] = "11/02/2020/12:00";
        Nurse2[Person.PERSON_BLOOTYPE] = "O+";
        Nurse2[Person.PERSON_GENDER] = "Masculino";

        String[] Nurse3 = new String[12];
        Nurse3[Nurse.NURSE_TYPELABORS] = "Enfermera de Urgencias";
        Nurse3[Employee.EMPLOYEE_SALARY] = "3000";
        Nurse3[Employee.EMPLOYEE_TURN] = "Diurna";
        Nurse3[Employee.EMPLOYEE_STARTDATEWORK] = "11/02/2020/12:00";
        Nurse3[Employee.EMPLOYEE_ENDDATEWORK] = "11/02/2020/12:00";
        Nurse3[Person.PERSON_ID] = "3";
        Nurse3[Person.PERSON_NAMEFIRST] = "Angie";
        Nurse3[Person.PERSON_LASTFIRST] = "Quintero";
        Nurse3[Person.PERSON_BIRTHDATE] = "11/02/2020/12:00";
        Nurse3[Person.PERSON_BLOOTYPE] = "O-";
        Nurse3[Person.PERSON_GENDER] = "Femenina";

        String[] Nurse4 = new String[12];
        Nurse4[Nurse.NURSE_TYPELABORS] = "Jefe de enfermeras";
        Nurse4[Employee.EMPLOYEE_SALARY] = "3000";
        Nurse4[Employee.EMPLOYEE_TURN] = "Nocturno";
        Nurse4[Employee.EMPLOYEE_STARTDATEWORK] = "11/02/2020/12:00";
        Nurse4[Employee.EMPLOYEE_ENDDATEWORK] = "11/02/2020/12:00";
        Nurse4[Person.PERSON_ID] = "1";
        Nurse4[Person.PERSON_NAMEFIRST] = "Marilyn";
        Nurse4[Person.PERSON_LASTFIRST] = "Chaparro";
        Nurse4[Person.PERSON_BIRTHDATE] = "11/02/2020/12:00";
        Nurse4[Person.PERSON_BLOOTYPE] = "A+";
        Nurse4[Person.PERSON_GENDER] = "Femenina";

        //SEGUNDA MANERA DE LLENAR EL VECTOR DE STRING
        //String[] Nurse1 = {"1", "Luis", "Chaparro", null, "Sogamoso", "No se", "Masculino", "300", "12 horaas", null, null,"Ninguna"};
        //String[] Nurse2 = {"30", "Felipe", "Hurtado", null, "Sogamoso", "No se", "Masculino", "30000.0", "12 horaas", null, null, "Ninguna"};
        //String[] Nurse3 = {"2", "Angie", "Cardenas", null, "Sogamoso", "No se", "Masculino",  "30000.0", "12 horaas", null, null, "Ninguna"};
        nurse.save(Nurse2);
        nurse.save(Nurse1);
        nurse.save(Nurse4);
        nurse.save(Nurse3);

        try {

            System.out.println("* NURSE\n");

            //List Print (Nurse) Unordered
            System.out.println("\nLISTA SIN ORDENAR: \n" + Arrays.toString(nurse.findAll().toArray()));
            nurse.sort();
            //List print (Nurse) sorted by ID
            System.out.println("\nLISTA ORDENADA: \n" + Arrays.toString(nurse.findAll().toArray()));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Algo salio mal");
        }

        //Filter a (Nurse) by ID or by name.
        String[] data1 = {"0", "Maria", "", null, "", "", "", "0", "", null, null, ""};
        nurse.sort();
        System.out.println("\nELEMENTOS ENCONTRADOS \n" + nurse.filterResults(data1));

        //DOCTOR TESTS
        DoctorController doctor = new DoctorController();

        //DATA
        String[] per1 = {"1", "Luis", "Chaparro", "13/23/1999/01:00", "Sogamoso", "No se", "Masculino", "300", "12 horaas", "04/02/2020/12:00", "11/02/2020/12:00", "Ninguna"};
        String[] per2 = {"8", "Felipe", "Hurtado", "11/14/1991/12:00", "Sogamoso", "No se", "Masculino", "30000.0", "12 horaas", "10/02/2020/12:00", "11/02/2020/12:00", "Ninguna"};
        String[] per4 = {"2", "Angie", "Cardenas", "11/08/1993/06:00", "Sogamoso", "No se", "Masculino", "30000.0", "12 horaas", "07/16/2020/12:00", "11/02/2020/12:00", "Ninguna"};
        String[] per5 = {"6", "Juan", "Perez", "11/02/1992/04:00", "Sogamoso", "No se", "Masculino", "30000.0", "12 horaas", "11/12/2020/12:00", "11/02/2020/12:00", "Ninguna"};

        doctor.save(per4);
        doctor.save(per5);
        doctor.save(per2);
        doctor.save(per1);

        try {

            System.out.println("\n\n\n* DOCTOR\n");

            //List printing (Doctor) without ordering
            System.out.println("\nLISTA SIN ORDENAR: \n" + Arrays.toString(doctor.findAll().toArray()));
            doctor.sort();
            //Print list (Doctor) ordered by ID
            System.out.println("\nLISTA ORDENADA: \n" + Arrays.toString(doctor.findAll().toArray()));

            System.out.println("\n\nCREACIÓN DE NUEVO DOCTOR");
            //Creation of a new (Doctor)
            doctor.create(new Doctor("Medicina General", 400, "Fines de Semana", null, null, 0, "Nicolas", "Parra", null, "Tunja", "No se", "Femenino"));
            doctor.sort();
            //List Print (Doctor)
            System.out.println(Arrays.toString(doctor.findAll().toArray()));
            doctor.sort();
            //Updating a new (Doctor)
            doctor.merge(1, new Doctor("Pediatria", 30000.0, "12 horaas", null, null, 20, "Luis", "Chaparro", null, "Sogamoso", "No se", "Masculino"));
            doctor.sort();
            System.out.println("\n\nACTUALIZACIÓN DE DATOS DE UN DOCTOR");
            //List Print (Doctor)
            System.out.println(Arrays.toString(doctor.findAll().toArray()));
            //Elimination of a (Doctor) by ID
            doctor.delete(2);
            doctor.sort();
            System.out.println("\n\nELIMINACIÓN DE UN DOCTOR");
            //List Print (Doctor)
            System.out.println(Arrays.toString(doctor.findAll().toArray()));

        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }

        //Filter a (Doctor) by ID or by name.
        String[] data = {"0", "", "", null, "", "", "", "0", "", null, null, ""};
        System.out.println("\nELEMENTOS ENCONTRADOS \n" + doctor.filterResults(data));
    }
}
