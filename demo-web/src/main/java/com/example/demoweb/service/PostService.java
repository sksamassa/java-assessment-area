package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class PostService {
    Integer count = 0;
    ArrayList<Post> posts = new ArrayList<>();
    public void createPost(String post) {
        long newId = 0;
        posts.add(new Post(post, count));

    }
    public ArrayList<Post> listAllPosts() {
        createPost("He don't likes complicated languages with many type of data.");
        createPost("Because he likes javascript.");
        createPost("His favorite language is python.");

        return posts;
    }
}
