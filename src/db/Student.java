package db;

import java.util.Date;

public class Student {
    Long id;
    String name;
    String surname;
    Date birthdate;
    String city;

    public Student() {}

    public void setId(Long id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setSurname(String surname) {this.surname=surname;}
    public void setBirthdate(Date birthdate) {this.birthdate=birthdate;}
    public void setCity(String city) {this.city=city; }

    public Student(String name, String surname, Date birthdate, String city) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity(city);
    }
    public Student(Long id, String name, String surname, Date birthdate, String city) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity(city);
    }

    public Long getId() {return this.id;}
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public Date getBirthdate() {return this.birthdate;}
    public String getCity() {return this.city;}

}
