package com.example.testsproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Name;
    private int Age;
    private String Login;
    private String Password;

    public Users(String name, int age, String login, String password) {
        Name = name;
        Age = age;
        Login = login;
        Password = password;
    }

    public Users() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(Name, users.Name) && Objects.equals(Login, users.Login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Login);
    }
}
