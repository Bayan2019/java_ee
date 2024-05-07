package db;

import java.sql.Timestamp;

public class Comment {
    private Long id;
    private String comment;
    private Timestamp post_date;
    private User author;
    private News news;

    public Comment() {}

    public void setId(Long id) {this.id=id;}
    public void setComment(String comment) {this.comment=comment;}
    public void setPost_date(Timestamp post_date) {this.post_date=post_date;}
    public void setAuthor(User author) {this.author=author;}
    public void setNews(News news) {this.news=news;}

    public Comment(Long id, String comment, Timestamp post_date, User author, News news) {
        this.setId(id);
        this.setComment(comment);
        this.setPost_date(post_date);
        this.setAuthor(author);
        this.setNews(news);
    }

    public Long getId() {return this.id;}
    public String getComment() {return this.comment;}
    public Timestamp getPost_date() {return this.post_date;}
    public User getAuthor() {return this.author;}
    public News getNews() {return this.news;}
}
