package com.team2.prototype1.config.entity.board;

import com.team2.prototype1.config.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "board_comment")
public class CommentEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    private Long icomment;

    @ManyToOne
    @JoinColumn(name="iboard", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private BoardEntity boardEntity;

    @Column(length = 10000, nullable = false)
    private String comment;

}
