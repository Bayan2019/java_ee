package db;

public class Item {
    public Long id;
    public String name;
    public String description;
    public double price;
    public int amount;

    public Item() {}

    public void setId(Long id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setDescription(String description) {this.description=description; }
    public void setPrice(double price) {
        this.price=price;
    }
    public void setAmount(int amount) {
        this.amount=amount;
    }

    public Item(Long id, String name, String description, double price) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
    }
    public Item(Long id, String name, double price, int amount) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setAmount(amount);
    }

    public Long getId() {
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
