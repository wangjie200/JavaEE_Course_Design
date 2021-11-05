package com.wang200.javaee_course_design.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    public static final long serialVersionId = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String password;

    private enum Identity{formal,admin};
    private Identity identity;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }
}
