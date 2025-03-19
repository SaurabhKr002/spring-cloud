package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User(List<Contact> contacts, String phone, String name, Long userId) {
        this.contacts = contacts;
        this.phone = phone;
        this.name = name;
        this.userId = userId;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }


    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
