package com.example.notesservice.repo;

import com.example.notesservice.domain.Likes;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LikeRepository extends MongoRepository<Likes,String> {
    List<Likes> getAllByContentId(String contentId);
}
