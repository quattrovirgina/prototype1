package com.team2.prototype1.config.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "comment")
public class CommentEntity extends BaseEntity {
    @JsonIgnore
    @Id
    @Column(columnDefinition = "BIGINT UNSIGNED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long icomment;

    @ManyToOne
    @JoinColumn(name="media", nullable = false)
    private

    @Column(length = 1000, nullable = false)
    private String comments;


}
