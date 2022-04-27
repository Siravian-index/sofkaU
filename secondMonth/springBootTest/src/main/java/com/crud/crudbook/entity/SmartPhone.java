package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class SmartPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer price;
}
