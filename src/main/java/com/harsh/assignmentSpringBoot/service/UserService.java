package com.harsh.assignmentSpringBoot.service;


import com.harsh.assignmentSpringBoot.entity.Restaurent;
import com.harsh.assignmentSpringBoot.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String bookUser(List<User> users);
    List<User> getUsers();
    Optional<User> getUser(Integer userId);
    String updateUser(User user);

    String deleteUser(Integer id);
}
