package db;

public class Language {
    int id;
    String name;
    String alpha2;

    public Language() {}

    public void setId(int id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setAlpha2(String alpha2) {this.alpha2=alpha2;}

    public Language(String name) {this.setName(name);}
    public Language(int id, String name) {
        this.setId(id);
        this.setName(name);
    }
    public Language(int id, String name, String alpha2) {
        this.setId(id);
        this.setName(name);
        this.setAlpha2(alpha2);
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public String getAlpha2() {return this.alpha2;}
}
