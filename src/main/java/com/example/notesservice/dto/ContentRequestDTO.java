package com.example.notesservice.dto;


import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContentRequestDTO {
    private String Id;
    private String note;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
