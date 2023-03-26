package com.example.notesservice.controller;

import com.example.notesservice.domain.Likes;
import com.example.notesservice.repo.LikeRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/likes")
@RestController
@Api(tags = "likes")
public class LikeController {
    @Autowired
    private LikeRepository likeRepository;

    @PostMapping
    public ResponseEntity<Likes> addLike(@RequestBody Likes likes){
        //todo here I am going to check if the user Id exist and if Exist has authorization to add link
        return ResponseEntity.ok(likeRepository.save(likes));
    }
    @DeleteMapping("/{likeId}")
    public ResponseEntity<Void> deleteLike(@PathVariable String likeId){
        //todo I will check if the user is authorized to dislike or not
        likeRepository.deleteById(likeId);
        return ResponseEntity.noContent().build();
    }
}
