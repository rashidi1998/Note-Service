package com.example.notesservice.dto;

import com.example.notesservice.domain.Likes;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContentResponseDTO {
    private String Id;
    private String note;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private List<Likes> likes;
}
