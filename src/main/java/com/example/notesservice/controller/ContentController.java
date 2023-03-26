package com.example.notesservice.controller;

import com.example.notesservice.domain.Content;
import com.example.notesservice.dto.ContentRequestDTO;
import com.example.notesservice.dto.ContentResponseDTO;
import com.example.notesservice.exception.CustomErrorModel;
import com.example.notesservice.service.ContentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@Api(tags = "contents")
@RequestMapping("/contents")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping
    public ResponseEntity<List<Content>> getAllContents() {
        return ResponseEntity.ok(contentService.getAllContents());
    }

    @PostMapping
    public ResponseEntity<Content> createPost(@RequestBody ContentRequestDTO content) {
        return ResponseEntity.ok(contentService.createContent(content));
    }

    @GetMapping("/{contentId}")
    public ResponseEntity<ContentResponseDTO> getContent(@PathVariable String contentId) {
        return ResponseEntity.ok(contentService.getContent(contentId).get());
    }

    @PutMapping("/{contentId}")
    public ResponseEntity<Content> editContent(@PathVariable String contentId, @RequestBody Content content) throws CustomErrorModel {
        return ResponseEntity.ok(contentService.updateContent(contentId, content));
    }

    @DeleteMapping("/{contentId}")
    public ResponseEntity<Void> deleteContent(@PathVariable String contentId) {
        contentService.deleteContent(contentId);
        return ResponseEntity.noContent().build();
    }

}
