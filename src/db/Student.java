package db;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    Long id;
    String name;
    String surname;
    LocalDate birthdate;
    String city;
    Long city_id;

    public Student() {}

    public void setId(Long id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setSurname(String surname) {this.surname=surname;}
    public void setBirthdate(LocalDate birthdate) {this.birthdate=birthdate;}
    public void setCity(String city) {this.city=city; }
    public void setCity_id(Long city_id) {this.city_id=city_id;}

    public Student(String name, String surname, LocalDate birthdate, String city) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity(city);
    }
    public Student(String name, String surname, LocalDate birthdate, Long city_id) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity_id(city_id);
        this.setCity(DBConnector.getCity(city_id).getName());
    }
    public Student(Long id, String name, String surname, LocalDate birthdate, String city) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity(city);
    }
    public Student(Long id, String name, String surname, LocalDate birthdate, String city, Long city_id) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthdate(birthdate);
        this.setCity(city);
        this.setCity_id(city_id);
    }

    public Long getId() {return this.id;}
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public LocalDate getBirthdate() {return this.birthdate;}
    public String getCity() {return this.city;}
    public Long getCity_id() {return this.city_id;}

}
