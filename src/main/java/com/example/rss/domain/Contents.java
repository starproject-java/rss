package com.example.rss.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class Contents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank // ①
    private String name;
    @NotBlank
    private Long point;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPoint() { return point; }
    public void setPoint(Long point) { this.point = point; }

    @Override
    public String toString() {
        return "Contents [id=" + id + ", name=" + name + ", point=" + point + "]";
    }
}
