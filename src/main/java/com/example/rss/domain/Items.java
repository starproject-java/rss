package com.example.rss.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty // ①
    private String item_name;
    @NotEmpty
    private Integer point;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return item_name;
    }
    public void setName(String name) {
        this.item_name = name;
    }
    public Integer getAge() {
        return point;
    }
    public void setAge(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Items [id=" + id + ", item_name=" + item_name + ", point=" + point + "]";
    }
}
