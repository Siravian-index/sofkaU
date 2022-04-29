package com.sofkau.relationaldb.service;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;

import java.util.List;

public interface IPostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    Post deletePost(Post post);

    List<Post> findAllPosts();
}
