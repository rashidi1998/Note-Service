package com.example.notesservice.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document
public class Content {
    @Id
    private String Id;
    private String note;
    @DBRef
    private List<Likes> likes;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
