package com.sofkau.relationaldb.repository;

import com.sofkau.relationaldb.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
