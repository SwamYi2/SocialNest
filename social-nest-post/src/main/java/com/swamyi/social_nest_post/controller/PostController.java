package com.swamyi.social_nest_post.controller;

import com.swamyi.social_nest_post.domain.Post;
import com.swamyi.social_nest_post.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Post>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }
}
