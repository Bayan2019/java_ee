package db;

public class Employee {

    public String name;
    public String surname;
    public String department;
    public int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.setName(name);
        this.setSurname(surname);
        this.setDepartment(department);
        this.setSalary(salary);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

}
