package com.fashionbook.entities;


import com.fashionbook.entities.enums.RoleType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MyRole {

    @Id
    private String id;
    private RoleType type;

    public MyRole(RoleType type) {
        this.type = type;
    }


    public RoleType getType() {
        return type;

    }

    public void setType(RoleType type) {
        this.type = type;
    }


}
