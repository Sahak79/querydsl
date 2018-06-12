package com.querydsl.repository.impl;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.model.QUser;
import com.querydsl.model.User;
import com.querydsl.repository.UserRepositoryCustom;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public User getUser() {
        QUser user = QUser.user;
        JPAQuery<User> query = new JPAQuery<>(entityManager);
        return query.select(user)
                .from(user)
                .where(user.name.eq("sahak"))
                .fetchOne();
    }
}

