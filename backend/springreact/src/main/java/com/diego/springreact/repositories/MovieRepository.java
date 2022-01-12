package com.diego.springreact.repositories;

import com.diego.springreact.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


/*
classe de acesso aos dados
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
