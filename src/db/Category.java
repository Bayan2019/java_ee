package db;

public class Category {
    int id;
    String name;

    public Category() {}

    public void setId(int id) {this.id=id;}
    public void setName(String name) {this.name=name;}

    public Category(String name) {this.setName(name);}
    public Category(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {return this.id;}
    public String getName(){return this.name;}
}
