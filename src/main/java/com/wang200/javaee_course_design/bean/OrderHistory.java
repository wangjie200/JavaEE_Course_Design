package com.wang200.javaee_course_design.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderHistory {
    public static final long serialVersionId = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String time;

    private int num;

    private int price;

    private int sumPrice;

    public String getTime() {
        return time;
    }

    public int getNum() {
        return num;
    }

    public int getPrice() {
        return price;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }
}
