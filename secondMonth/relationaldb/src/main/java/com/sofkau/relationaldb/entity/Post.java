package com.sofkau.relationaldb.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private  String title;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    final private List<Comment> commentList = new ArrayList<>();
    public Post addComment(Comment comment) {
        this.commentList.add(comment);
        return this;
    }
}
