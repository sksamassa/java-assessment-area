package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Date creationDate;

    private Integer likes = 0;

    public String getText() {
        return text;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Integer getLikes() {
        return likes;
    }
    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Post() {
    }

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        creationDate = date;
    }
}
