package com.example.testsproject.repository;

import com.example.testsproject.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    //public Users findUserByNameAndLogin(String name, String login);
}
