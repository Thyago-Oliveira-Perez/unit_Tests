package com.example.testsproject.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    User user = new User("nome", 18, "user1", "root");

    @Test
    public void UserTes(){
        assertEquals("nome", user.getName());
    }

    @Test
    public void UserGerarId(){
        assertTrue(user.gerarId(1));
    }
}
