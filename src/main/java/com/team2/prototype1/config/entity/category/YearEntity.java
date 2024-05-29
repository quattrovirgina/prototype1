package com.team2.prototype1.config.entity.category;

import com.team2.prototype1.config.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="year")
public class YearEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED", name="iyear")
    private Long iyear;
}
