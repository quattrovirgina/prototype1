package com.team2.prototype1.config.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @JsonIgnore
    @Id
    @Column(columnDefinition = "BIGINT UNSIGNED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iuser;

    @Column(length = 100, nullable = false)
    private String uid;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 10000, nullable = false)
    private long look;
    // 조회수


}
