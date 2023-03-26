package com.example.notesservice.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Document
public class Likes {
    @Id
    private String likeId;
    private String contentId;
    private String userId;
    private LocalDate createdAt;
}
