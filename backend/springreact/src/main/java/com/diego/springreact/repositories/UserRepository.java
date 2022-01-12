package com.diego.springreact.repositories;

import com.diego.springreact.entities.Movie;
import com.diego.springreact.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


/*
classe de acesso aos dados
 */
public interface UserRepository extends JpaRepository<User, Long> {


    User findByEmail(String email);
}
