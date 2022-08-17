package com.example.testsproject.controllers;

import com.example.testsproject.entities.Users;
import com.example.testsproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value = "/users")
    @ResponseBody
    public List<Users> findAllUsers(){
        return usersRepository.findAll();
    }

}
