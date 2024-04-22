package db;

public class Item {
    public int id;
    public String name;
    public double price;
    public int amount;

    public Item() {}

    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public void setAmount(int amount) {
        this.amount=amount;
    }

    public Item(int id, String name, double price, int amount) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setAmount(amount);
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getAmount() {
        return this.amount;
    }
}
