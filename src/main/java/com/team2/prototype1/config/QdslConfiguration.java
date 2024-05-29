package com.team2.prototype1.config;


import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class QdslConfiguration {

    @PersistenceContext
    private EntityManager em;

    @Bean
    public JPAQueryFactory createJPAFactory() {
        return new JPAQueryFactory(JPQLTemplates.DEFAULT, em);
    }
}
