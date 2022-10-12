package com.example.demospringweb.repository;

import com.example.demospringweb.model.Post;
import com.example.demospringweb.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}