package db;

public class News {
    Long id;
    String title;
    String content;
    String author;
    String category;

    public News() {};

    public void setId(Long id) {this.id=id;}
    public void setTitle(String title) {this.title=title;}
    public void setContent(String content) {this.content=content;}
    public void setAuthor(String author) {this.author=author;}
    public void setCategory(String category) {this.category=category;}

    public News(Long id, String title, String content, String author, String category) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setAuthor(author);
        this.setCategory(category);
    }

    public Long getId() {return this.id;}
    public String getTitle() {return this.title;}
    public String getContent() {return this.content;}
    public String getAuthor() {return this.author;}
    public String getCategory() {return this.category;}
}
