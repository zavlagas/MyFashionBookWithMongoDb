package com.fashionbook.entities;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Document(collection = "products")
public class Product {

    private String id;
    private String title;
    @Field("descr")
    private String description;
    private List<String> images;
    private Date createdDate;
    private Brand brand;


    public Product(String title, String description, List<String> images,Date createdDate , Brand brand) {
        this.title = title;
        this.description = description;
        this.images = images;
        this.createdDate = createdDate;
        this.brand = brand;
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

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
