package com.querydsl.repository;

import com.querydsl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends UserRepositoryCustom,
        PagingAndSortingRepository<User, Long>, QueryDslPredicateExecutor<User> {

}
