package com.example.notesservice.dto;

import com.example.notesservice.domain.Content;

import java.time.LocalDate;

public class ContentMapper {
    public static Content convertToDO(ContentRequestDTO content){
        Content content1 = new Content();
        content1.setNote(content.getNote());
        content1.setCreatedAt(content.getCreatedAt());
        content1.setUpdatedAt(content.getUpdatedAt());
        return content1;
    }
    public static ContentResponseDTO convertToResponse(ContentRequestDTO contentRequestDTO){
        ContentResponseDTO responseDTO = new ContentResponseDTO();
        responseDTO.setNote(contentRequestDTO.getNote());
        responseDTO.setCreatedAt(contentRequestDTO.getCreatedAt());
        responseDTO.setUpdatedAt(contentRequestDTO.getUpdatedAt());
        return responseDTO;
    }
}
