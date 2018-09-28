package com.monkey1024.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 用户
 */
public class User {
//    private String id; 严格来说这里应该有个主键id
    private String name;

    private String phone;

    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public User(){//无参构造方法

    }

    public User(String name, String phone, String address, LocalDate birthday) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
