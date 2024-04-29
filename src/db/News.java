package db;

import java.time.LocalDate;

public class News {
    Long id;
    String title;
    String content;
    String author;
    Category category;
    Language language;
    LocalDate post_date;

    public News() {};

    public void setId(Long id) {this.id=id;}
    public void setTitle(String title) {this.title=title;}
    public void setContent(String content) {this.content=content;}
    public void setAuthor(String author) {this.author=author;}
    public void setCategory(Category category) {this.category=category;}
    public void setLanguage(Language language) {this.language=language;}
    public void setPost_date(LocalDate post_date) {this.post_date=post_date;}

    public News(Long id, String title, String content, String author, Category category) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setAuthor(author);
        this.setCategory(category);
    }
    public News(Long id, String title, String content, String author,
                Category category, Language language, LocalDate post_date) {
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
    public String getAuthor() {return this.author;}
    public Category getCategory() {return this.category;}
    public Language getLanguage() {return this.language;}
    public LocalDate getPost_date() {return this.post_date;}
}
