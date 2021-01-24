package com.fashionbook.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Document(collection = "users")
public class MyUser {
    @Id
    private String id;
    private String fname;
    private String lname;
    @Field("usrnme")
    private String username;
    @Field("passwrd")
    private String password;
    private String email;
    private Date dob;
    private String image;
    private MyRole role;
    private List<Product> likedProducts;
    private List<Brand> likedBrands;


    public MyUser(String fname, String lname, String username, String password, String email, Date dob, String image, MyRole role) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.image = image;
        this.role = role;
        this.likedProducts = new LinkedList<>();
        this.likedBrands = new LinkedList<>();
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Brand> getLikedBrands() {
        return likedBrands;
    }

    public void setLikedBrands(List<Brand> likedBrands) {
        this.likedBrands = likedBrands;
    }

    public List<Product> getLikedProducts() {
        return likedProducts;
    }

    public void setLikedProducts(List<Product> likedProducts) {
        this.likedProducts = likedProducts;
    }
}
