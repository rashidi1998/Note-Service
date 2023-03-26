package com.example.notesservice.repo;

import com.example.notesservice.domain.Content;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ContentRepository extends MongoRepository<Content,String> {
  @Query("{'$query': {}, '$orderby': {'createdAt': -1}}")
  List<Content> findAllByNewToOld();
}
