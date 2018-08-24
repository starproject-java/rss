package com.example.rss.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class UserContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private Integer user_id;
    @NotEmpty
    private Integer content_id;
    @NotEmpty
    private Integer done;
    @NotEmpty
    private Integer reset;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer usr_id) {
        this.user_id = user_id;
    }
    public Integer getContent_id() {
        return content_id;
    }
    public void setAge(Integer content_id) {
        this.content_id = content_id;
    }
    public Integer getdone() {
        return done;
    }
    public void setTeam(Integer done) {
        this.done = done;
    }
    public Integer getReset() {
        return reset;
    }
    public void setReset(Integer reset) {
        this.reset = reset;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", user_id=" + user_id + ", content_id=" + content_id + ", done=" + done + ", reset=" + reset + "]";
    }
}

