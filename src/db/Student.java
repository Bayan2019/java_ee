package db;

public class Student {
    public String name;
    public String surname;
    public double gpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        this.setName(name);
        this.setSurname(surname);
        this.setGpa(gpa);
    }

    public String getName() {
        return this.name;
    }

    public String getSurame() {
        return this.surname;
    }

    public double getGpa() {
        return this.gpa;
    }
}
