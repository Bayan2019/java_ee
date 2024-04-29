package db;

public class Language {
    int id;
    String name;

    public Language() {}

    public void setId(int id) {this.id=id;}
    public void setName(String name) {this.name=name;}

    public Language(String name) {this.setName(name);}
    public Language(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {return this.id;}
    public String getName(){return this.name;}
}
