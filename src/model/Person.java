/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Date;

public class Person{

    public static final int PERSON_ID = 0;
    public static final int PERSON_NAMEFIRST = 1;
    public static final int PERSON_LASTFIRST = 2;
    public static final int PERSON_BIRTHDATE = 3;
    public static final int PERSON_CITY = 4;
    public static final int PERSON_BLOOTYPE = 5;
    public static final int PERSON_GENDER = 6;

    protected int id;
    protected String nameFirst;
    protected String lastFirst;
    protected Date birthDate;
    protected String city;
    protected String blooType;
    protected String gender;

    public Person(int id, String nameFirst, String lastFirst, Date birthDate, String city, String blooType, String gender) {
        this.id = id;
        this.nameFirst = nameFirst;
        this.lastFirst = lastFirst;
        this.birthDate = birthDate;
        this.city = city;
        this.blooType = blooType;
        this.gender = gender;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getLastFirst() {
        return lastFirst;
    }

    public void setLastFirst(String lastFirst) {
        this.lastFirst = lastFirst;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBlooType() {
        return blooType;
    }

    public void setBlooType(String blooType) {
        this.blooType = blooType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPerson{" + "Id=" + id + ", NameFirst=" + nameFirst + ", LastFirst=" + lastFirst + ", BirthDate=" + birthDate + ", City=" + city + ", BlooType=" + blooType + ", Gender=" + gender + '}';
    }

}
