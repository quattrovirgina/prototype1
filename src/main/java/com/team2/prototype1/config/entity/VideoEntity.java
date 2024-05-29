package com.team2.prototype1.config.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="video")

public class VideoEntity extends BaseEntity {
}
