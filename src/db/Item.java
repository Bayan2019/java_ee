package db;

public class Item {
    Long id;
    String name;
    String description;
    double price;
    int amount;
    Brand brand;

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
    public void setBrand(Brand brand) {this.brand=brand;}

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
    public Item(String name, String description, double price, Long brand_id) {
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setBrand(DBConnector.getBrand(brand_id));
    }

    public Item(long id, String name, String description, double price, int amount, Long brand_id) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setAmount(amount);
        this.setBrand(DBConnector.getBrand(brand_id));
    }

    public Item(long id, String name, String description, double price, int amount, Brand brand) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setAmount(amount);
        this.setBrand(brand);
    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() { return this.description; }
    public double getPrice() {
        return this.price;
    }
    public int getAmount() {
        return this.amount;
    }
    public Brand getBrand() {return this.brand;}
}
