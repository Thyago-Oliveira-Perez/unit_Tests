package com.example.testsproject.repository;

import com.example.testsproject.entities.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UsersRepositoryTests {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    @DisplayName("Inseri 1 usuario e listar")
    public void insertUser(){
        Users users = new Users("nome", 18, "user1", "root");
        usersRepository.save(users);
        Integer countOfUsers = usersRepository.findAll().size();
        assertEquals(1, countOfUsers);
    }
}
