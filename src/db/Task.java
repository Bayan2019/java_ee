package db;

public class Task {
    Long id;
    String name;
    String description;
    String deadlineDate;

    public void setId(Long id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setDescription(String description) {
        this.description=description;
    }
    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate=deadlineDate;
    }

    public Task() {}
    public Task(Long id, String name, String description, String deadlineDate) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setDeadlineDate(deadlineDate);
    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDeadlineDate() {
        return this.deadlineDate;
    }
}
