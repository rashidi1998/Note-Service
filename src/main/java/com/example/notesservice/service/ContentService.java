package com.example.notesservice.service;

import com.example.notesservice.domain.Content;
import com.example.notesservice.exception.CustomErrorModel;
import com.example.notesservice.repo.ContentRepository;
import com.example.notesservice.repo.LikeRepository;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContentService {
    private final ContentRepository contentRepository;
    private final LikeRepository likeRepository;

    public ContentService(ContentRepository noteRepository, LikeRepository likeRepository) {
        this.contentRepository = noteRepository;
        this.likeRepository = likeRepository;
    }

    public Content createContent(Content content) {
        content.setCreatedAt(LocalDate.now());
        return contentRepository.save(content);
    }

    public List<Content> getAllContents() {
        return contentRepository.findAllByNewToOld();
    }

    public Optional<Content> getContent(String contentId) {
        return contentRepository.findById(contentId);
    }

    public void deleteContent(String contentId) {
        contentRepository.deleteById(contentId);
    }

    public Content updateContent(String contentId, Content content) {
        Optional<Content> content1 = contentRepository.findById(contentId);
        if (content1.isPresent()) {
            Content content2 = content1.get();
            content2.setNote(content.getNote());
            content2.setUpdatedAt(LocalDate.now());
            return contentRepository.save(content2);
        } else {
            throw new CustomErrorModel("Not found");
        }
    }
}
