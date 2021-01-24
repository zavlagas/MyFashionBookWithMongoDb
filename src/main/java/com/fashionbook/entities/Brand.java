package com.fashionbook.entities;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "brands")
public class Brand {

    private String id;
    private String title;
    @Field("descr")
    private String description;
    private MyUser user;

    private Brand(String title,String description){
        this.title = title;
        this.description = description;
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
}
