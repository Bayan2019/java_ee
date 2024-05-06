package db;

import java.time.LocalDate;

public class Comment {
    private Long id;
    private String comment;
    private LocalDate post_date;
    private User author;
    private News news;

    public Comment() {}

    public void setId(Long id) {this.id=id;}
    public void setComment(String comment) {this.comment=comment;}
    public void setPost_date(LocalDate post_date) {this.post_date=post_date;}
    public void setAuthor(User author) {this.author=author;}
    public void setNews(News news) {this.news=news;}

    public Comment(Long id, String comment, LocalDate post_date, User author, News news) {
        this.setId(id);
        this.setComment(comment);
        this.setPost_date(post_date);
        this.setAuthor(author);
        this.setNews(news);
    }

    public Long getId() {return this.id;}
    public String getComment() {return this.comment;}
    public LocalDate getPost_date() {return this.post_date;}
    public User getAuthor() {return this.author;}
    public News getNews() {return this.news;}
}
