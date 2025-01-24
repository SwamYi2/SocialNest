package com.swamyi.social_nest_post.service;

import com.swamyi.social_nest_post.domain.Post;
import com.swamyi.social_nest_post.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepo;

    public Iterable<Post> getAllPosts() {
       return postRepo.findAll();
    }
}
