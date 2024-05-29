package com.team2.prototype1.config.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="data")
public class DataEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED", name="idata")
    private Long idata;

    @ManyToOne
    @JoinColumn(name="imedia", nullable=false)


}
