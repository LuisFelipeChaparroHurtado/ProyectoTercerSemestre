/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person {

    public static final int EMPLOYEE_SALARY = 7;
    public static final int EMPLOYEE_TURN = 8;
    public static final int EMPLOYEE_STARTDATEWORK = 9;
    public static final int EMPLOYEE_ENDDATEWORK = 10;

    protected double salary;
    protected String turn;
    protected Date startDateWork;
    protected Date endDateWork;

    public Employee() {
        super();
    }

    public Employee(double salary, String turn, Date startDateWork, Date endDateWork, int id, String nameFirst, String lastFirst, Date birthDate, String city, String blooType, String gender) {
        super(id, nameFirst, lastFirst, birthDate, city, blooType, gender);
        this.salary = salary;
        this.turn = turn;
        this.startDateWork = startDateWork;
        this.endDateWork = endDateWork;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public Date getStartDateWork() {
        return startDateWork;
    }

    public void setStartDateWork(Date startDateWork) {
        this.startDateWork = startDateWork;
    }

    public Date getEndDateWork() {
        return endDateWork;
    }

    public void setEndDateWork(Date endDateWork) {
        this.endDateWork = endDateWork;
    }

    @Override
    public String toString() {
        return super.toString()+"\n          "+"Employee{" + "Salary=" + salary + ", Turn=" + turn + ", StartDateWork=" + startDateWork + ", EndDateWork=" + endDateWork + '}' ;
    }

    

}
