package db;

public class User {
    private Long id;
    private String email;
    private String password;
    private String fullName;

    public User() {}

    public void setId(Long id) { this.id=id; }
    public void setEmail(String email) {this.email=email; }
    public void setPassword(String password) {this.password=password;}
    public void setFullName(String fullName) {this.fullName=fullName;}

    public User(String fullName) {this.setFullName(fullName);}
    public User(String email, String password, String fullName) {
        this.setEmail(email);
        this.setPassword(password);
        this.setFullName(fullName);
    }
    public User(Long id, String email, String password, String fullName) {
        this.setId(id);
        this.setEmail(email);
        this.setPassword(password);
        this.setFullName(fullName);
    }

    public Long getId() { return this.id;}
    public String getEmail() { return this.email;}
    public String getPassword() { return this.password;}
    public String getFullName() { return this.fullName;}
}
