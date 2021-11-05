package com.wang200.javaee_course_design.bean;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.Objects;

@Entity
@Table(name="ActionHistory")
public class ActionHistory {
    public static final long serialVersionId = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private enum Action{addRepertory,decreaseRepertory,addBook} ;
    private Action action;

    private String time;

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }


    public void setAction(Action action) {
        this.action = action;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Action getAction() {
        return action;
    }
    //    public String getAction() {
//        switch (action){
//            case addBook:
//                return "addBook";
//            break;
//            case decreaseRepertory:
//                return "decreaseRepertory";
//            break;
//            case addRepertory:
//                return "addRepertory";
//            break;
//        }
}
