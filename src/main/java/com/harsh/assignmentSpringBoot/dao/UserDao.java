package com.harsh.assignmentSpringBoot.dao;


import com.harsh.assignmentSpringBoot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
}
