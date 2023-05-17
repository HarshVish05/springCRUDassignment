package com.harsh.assignmentSpringBoot.controller;

import com.harsh.assignmentSpringBoot.entity.Restaurent;
import com.harsh.assignmentSpringBoot.entity.User;
import com.harsh.assignmentSpringBoot.service.RestaurentService;
import com.harsh.assignmentSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/bookusers")
    public String bookUsers(@RequestBody() List<User> users){
        return userService.bookUser(users);
    }

    @GetMapping("/getusers")
    public List<User> bookUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getuser")
    public Optional<User> bookusers(@RequestParam("restroId") Integer userId){
        return userService.getUser(userId);
    }
    @PutMapping("/updateuser")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteuser")
    public String deleteUser(@RequestParam("id") Integer id){
        return userService.deleteUser(id);
    }
}
