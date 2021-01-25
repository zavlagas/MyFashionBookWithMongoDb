package com.fashionbook.entities;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Document(collection = "brands")
public class Brand {

    private String id;
    private String title;
    @Field("descr")
    private String description;
    private MyUser user;
    private Date createdDate;


    private Brand(String title,String description,MyUser user,Date createdDate){
        this.title = title;
        this.description = description;
        this.user = user;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MyUser getUser(){
        return this.user;
    }

    public void setUser(MyUser user){
        this.user = user;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

}
