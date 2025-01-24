package com.swamyi.social_nest_post.repository;

import com.swamyi.social_nest_post.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
