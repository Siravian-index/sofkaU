package com.sofkau.relationaldb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String message;
    private Long foreignKey;
}
