package db;

import java.time.LocalDate;

public class Comment {
    private Long id;
    private String comment;
    private LocalDate post_date;
    private Long author_id;
    private Long news_id;

    public Comment() {}

    public void setId(Long id) {this.id=id;}
    public void setComment(String comment) {this.comment=comment;}
    public void setPost_date(LocalDate post_date) {this.post_date=post_date;}
    public void setAuthor_id(Long author_id) {this.author_id=author_id;}
    public void setNews_id(Long news_id) {this.news_id=news_id;}

    public Comment(Long id, String comment, LocalDate post_date, Long author_id, Long news_id) {
        this.setId(id);
        this.setComment(comment);
        this.setPost_date(post_date);
        this.setAuthor_id(author_id);
        this.setNews_id(news_id);
    }

    public Long getId() {return this.id;}
    public String getComment() {return this.comment;}
    public LocalDate getPost_date() {return this.post_date;}
    public Long getAuthor_id() {return this.author_id;}
    public Long getNews_id() {return this.news_id;}
}
