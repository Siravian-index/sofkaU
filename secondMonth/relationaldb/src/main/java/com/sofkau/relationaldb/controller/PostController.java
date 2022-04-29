package com.sofkau.relationaldb.controller;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/v1/posts")
public class PostController {

    //why an interface?
    @Autowired
    private IPostService service;

    @GetMapping
    public List<Post> getAllPosts() {
        return service.findAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.createPost(post);
    }

    @PostMapping
    public Post createComment(@RequestBody Comment comment) {
        return service.createComment(comment);
    }

    @DeleteMapping
    public Post deletePost(@RequestBody Post post) {
        return service.deletePost(post);
    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment) {
        service.deleteComment(comment);
    }


}
