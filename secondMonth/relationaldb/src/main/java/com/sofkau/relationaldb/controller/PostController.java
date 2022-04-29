package com.sofkau.relationaldb.controller;

import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.service.PostServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/v1/posts")
public class PostController {

    private final PostServiceImplementation postService;

    @Autowired
    public PostController(PostServiceImplementation postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.findAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @DeleteMapping
    public Post deletePost(@RequestBody Post post) {
        return postService.deletePost(post);
    }


}
