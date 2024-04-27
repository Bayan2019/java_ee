package db;

public class Brand {
    Long id;
    String name;
    String country;

    public Brand() {}

    public void setId(Long id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setCountry(String country) {this.country=country;}

    public Brand(String name, String country) {
        this.setName(name);
        this.setCountry(country);
    }
    public Brand(Long id, String name, String country) {
        this.setId(id);
        this.setName(name);
        this.setCountry(country);
    }

    public Long getId() {return this.id;}
    public String getName() {return this.name;}
    public String getCountry() {return this.country;}
}
