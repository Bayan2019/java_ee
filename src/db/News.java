package db;

import java.sql.Timestamp;

public class News {
    private Long id;
    private String title;
    private String content;
    private User author;
    private Category category;
    private Language language;
    private Timestamp post_date;

    public News() {};

    public void setId(Long id) {this.id=id;}
    public void setTitle(String title) {this.title=title;}
    public void setContent(String content) {this.content=content;}
    public void setAuthor(User author) {this.author=author;}
    public void setCategory(Category category) {this.category=category;}
    public void setLanguage(Language language) {this.language=language;}
    public void setPost_date(Timestamp post_date) {this.post_date=post_date;}

    public News(Long id, String title, String content, User author, Category category) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setAuthor(author);
        this.setCategory(category);
    }
    public News(Long id, String title, String content, User author,
                Category category, Language language, Timestamp post_date) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setAuthor(author);
        this.setCategory(category);
        this.setLanguage(language);
        this.setPost_date(post_date);
    }

    public Long getId() {return this.id;}
    public String getTitle() {return this.title;}
    public String getContent() {return this.content;}
    public User getAuthor() {return this.author;}
    public Category getCategory() {return this.category;}
    public Language getLanguage() {return this.language;}
    public Timestamp getPost_date() {return this.post_date;}
}
