package db;

public class Task {
    Long id;
    String name;
    String description;
    String deadlineDate;
    Boolean completed;

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
    public void setCompleted(Boolean completed) {this.completed=completed; }

    public Task() {}
    public Task(Long id, String name, String description, String deadlineDate, Boolean completed) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setDeadlineDate(deadlineDate);
        this.setCompleted(completed);
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
    public Boolean getCompleted() { return this.completed; }
}
