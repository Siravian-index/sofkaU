package com.sofkau.relationaldb.service;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;

public interface ICommentService {
    Post createComment(Comment comment);

    void deleteComment(Comment comment);
}
