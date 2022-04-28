package com.sofkau.relationaldb.service;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPostService {

    Post createPost(Post post);
    Post createComment(Comment comment);
    void deleteComment(Comment comment);
    Post deletePost(Post post);

    List<Post> findAllPosts();
}
