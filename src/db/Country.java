package db;

public class Country {
    String name;
    String code;

    public Country() {}

    public void setName(String name) {this.name=name;}
    public void setCode(String code) {this.code=code;}

    public Country(String name, String code) {
        this.setName(name);
        this.setCode(code);
    }

    public String getName() {return this.name;}
    public String getCode() {return this.code;}
}
