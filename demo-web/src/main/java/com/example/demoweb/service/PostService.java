package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new LinkedList<>();
        Post post1 = new Post("He don't likes complicated languages with many type of data.");
        Post post2 = new Post("Because he likes javascript.");
        Post post3 = new Post("His favorite language is python.");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
