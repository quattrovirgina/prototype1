package com.team2.prototype1.config.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "media")
public class MediaEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED", name="imedia")
    private Long imedia;

    @ManyToOne
    @JoinColumn(name="user", nullable=false)
    private UserEntity iuser;

    @Column(length = 1, columnDefinition = "TINYINT UNSIGNED")
    private int classification;

}
