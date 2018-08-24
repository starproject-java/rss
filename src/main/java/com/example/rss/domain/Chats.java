package com.example.rss.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class Chats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private Integer userId;

    @NotEmpty
    private Integer familyId;

    @NotEmpty
    private String comment;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getFamilyId() {
        return familyId;
    }
    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }
    public String getComment() {
        return comment;
    }
    public void setTeam(String comment) { this.comment = comment; }

    @Override
    public String toString() {
        return "Player [id=" + id + ", userId=" + userId + ", familyId=" + familyId + ", comment=" + comment + "]";
    }
}
