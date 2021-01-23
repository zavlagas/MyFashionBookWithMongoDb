package com.fashionbook.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
public class MyUser {
    @Id
    private String id;
    private String fname;
    private String lname;
    private Date dob;
    private String image;
    private MyRole role;


    private MyUser(String fname,String lname,Date dob,String image,MyRole role){
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.image = image;
        this.role = role;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MyRole getRole() {
        return role;
    }

    public void setRole(MyRole role) {
        this.role = role;
    }
}
