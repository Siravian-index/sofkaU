package com.sofkau.relationaldb.service;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.repository.CommentRepository;
import com.sofkau.relationaldb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImplementation implements ICommentService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public Post createComment(Comment comment) {
        Optional<Post> post = postRepository.findById(comment.getForeignKey());
        if (post.isPresent()) {
            Post realPost = post.get();
            realPost.addComment(comment);
            commentRepository.save(comment);
            return postRepository.save(realPost);
        }
        System.out.println("Cannot create comment for a non-existent post");
//        set status code to 404
        return null;
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.deleteById(comment.getId());
    }

}
