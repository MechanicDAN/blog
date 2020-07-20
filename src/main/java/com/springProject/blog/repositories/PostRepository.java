package com.springProject.blog.repositories;

import com.springProject.blog.model.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {

}
