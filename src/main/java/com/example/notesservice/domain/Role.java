package com.example.notesservice.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
    @Id
    private String id;

    private AppUserRole name;

    public Role() {

    }

    public Role(AppUserRole name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppUserRole getName() {
        return name;
    }

    public void setName(AppUserRole name) {
        this.name = name;
    }
}