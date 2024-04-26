package db;

public class City {
    Long id;
    String name;
    String code;

    public City() {}

    public void setId(Long id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setCode(String code) {this.code=code;}

    public City(String name, String code) {
        this.setName(name);
        this.setCode(code);
    }
    public City(Long id, String name, String code) {
        this.setId(id);
        this.setName(name);
        this.setCode(code);
    }

    public Long getId() {return this.id;}
    public String getName() {return this.name;}
    public String getCode() {return this.code;}
}
