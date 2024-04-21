package db;

public class Footballer {
    Long id;
    String name;
    String surname;
    int salary;
    String club;
    int transferPrice;

    public Footballer() {}

    public void setId(Long id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public void setClub(String club) {
        this.club=club;
    }
    public void setTransferPrice(int transferPrice) {
        this.transferPrice=transferPrice;
    }

    public Footballer(Long id, String name, String surname, int salary, String club, int transferPrice) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setSalary(salary);
        this.setClub(club);
        this.setTransferPrice(transferPrice);
    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getSalary() {
        return this.salary;
    }
    public String getClub() {
        return this.club;
    }
    public int getTransferPrice() {
        return this.transferPrice;
    }
}
