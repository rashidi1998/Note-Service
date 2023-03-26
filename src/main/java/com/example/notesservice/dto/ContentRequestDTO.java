package com.example.notesservice.dto;

import com.example.notesservice.domain.Likes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentRequestDTO {
    private String Id;
    private String note;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
