package com.example.notesservice.domain;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @ManyToOne
    @JoinColumn(name = "content_id")
    private String contentId;
    @ManyToOne()
    private String userId;
    private LocalDate createdAt;
}
