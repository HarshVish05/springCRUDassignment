package com.harsh.assignmentSpringBoot.service;

import com.harsh.assignmentSpringBoot.dao.UserDao;

import com.harsh.assignmentSpringBoot.entity.Restaurent;
import com.harsh.assignmentSpringBoot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public String bookUser(List<User> users) {
        userDao.saveAll(users);
        return "User is saved successfully"+users.size();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>)userDao.findAll();
    }

    @Override
    public Optional<User> getUser(Integer userId) {
        return (Optional<User>) userDao.findById(userId);
    }

    @Override
    public String updateUser(User user){
        userDao.save(user);
        return "record updated successfully";
    }

    @Override
    public String deleteUser(Integer id){
        userDao.deleteById(id);
        return "user deleted successfully";
    }

}
