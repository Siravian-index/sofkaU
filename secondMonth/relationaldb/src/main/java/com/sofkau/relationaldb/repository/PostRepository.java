package com.sofkau.relationaldb.repository;

import com.sofkau.relationaldb.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
