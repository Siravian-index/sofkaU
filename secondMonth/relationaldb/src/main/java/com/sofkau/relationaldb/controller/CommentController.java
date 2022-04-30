package com.sofkau.relationaldb.controller;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.service.CommentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentServiceImplementation commentService;

    @Autowired
    public CommentController(CommentServiceImplementation commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Post createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment) {
        commentService.deleteComment(comment);
    }


}
