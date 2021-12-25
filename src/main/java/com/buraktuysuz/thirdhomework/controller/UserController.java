package com.buraktuysuz.thirdhomework.controller;

import com.buraktuysuz.thirdhomework.entity.User;
import com.buraktuysuz.thirdhomework.service.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserEntityService userEntityService;

    @GetMapping("/")
    public List<User> findAllUser(){
        return userEntityService.findAllUser();
    }
    @GetMapping("/username/{username}")
    public User findUserByUsername(@PathVariable String username){
        return userEntityService.findUserByUsername(username);
    }
    @GetMapping("/{id}")
    public User findUserById(@PathVariable String id){
        return userEntityService.finUserById(id);
    }
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userEntityService.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id){
        if(userEntityService.checkUserById(id)){
            throw new NotFoundException("User Not Found");
        }

        try {
            userEntityService.deleteById(id);
            return new ResponseEntity<>("Delete Successful", OK);
        }catch (RuntimeException e){
            return new ResponseEntity<>("Delete Failed",BAD_REQUEST);
        }

    }
}
