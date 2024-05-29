package com.team2.prototype1.config.entity.board;

import com.team2.prototype1.config.entity.BaseEntity;
import com.team2.prototype1.config.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "board")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iboard")
    private Long iboard;

    @ManyToOne
    @JoinColumn(name="iuser", nullable = false)
    private UserEntity iuser;

    @Column(length = 5000)
    private String title;

    @Column(length = 10000)
    private String contents;

    @Column(length = 10000)
    private Long look;

    @ToString.Exclude
    @OneToMany(mappedBy = "boardEntity", cascade = CascadeType.PERSIST)
    private List<CommentEntity> commentEntityList = new ArrayList<>();


}
