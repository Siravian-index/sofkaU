package com.sofkau.relationaldb.service;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.repository.CommentRepository;
import com.sofkau.relationaldb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements IPostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post createComment(Comment comment) {
//        try {
//            Post post = postRepository.findById(comment.getForeignKey()).get();
//            post.addComment(comment);
//            commentRepository.save(comment);
//            return postRepository.save(post);
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//        ----------------
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

    @Override
    public Post deletePost(Post post) {
        final byte ZERO_COMMENTS = 0;
        Post postToDelete = postRepository.getById(post.getId());
        List<Comment> containedComments = postToDelete.getCommentList();
        if (containedComments.size() > ZERO_COMMENTS) {
            for (Comment comment : containedComments) {
                commentRepository.deleteById(comment.getId());
            }
        }
        postRepository.deleteById(post.getId());
        return postToDelete;
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
