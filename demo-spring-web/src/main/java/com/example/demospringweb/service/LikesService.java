package com.example.demospringweb.service;

import com.example.demospringweb.model.Post;
import com.example.demospringweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    private PostService postService;
    @Autowired
    PostRepository postRepository;

    public int like(Long postId) {
        Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
