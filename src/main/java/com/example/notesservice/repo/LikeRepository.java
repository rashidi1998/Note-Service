package com.example.notesservice.repo;

import com.example.notesservice.domain.Likes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository extends MongoRepository<Likes,String> {
}
