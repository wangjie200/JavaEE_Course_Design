package com.wang200.javaee_course_design.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookList {
    public static final long serialVersionId = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    private String name;

    private int price;

    private int repertory;

    public long getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }
}
