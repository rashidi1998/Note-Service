package com.example.notesservice.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class Content {
    @Id
    private String Id;
    private String note;
    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Likes> likes = new ArrayList<>();
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
