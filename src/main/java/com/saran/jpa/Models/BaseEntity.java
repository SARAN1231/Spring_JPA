package com.saran.jpa.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass // this is entity but table is not created at DB it just have common fields we can use it by inheritance(extends)
public class BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
