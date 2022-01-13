package com.diego.springreact.repositories;

import com.diego.springreact.entities.Score;
import com.diego.springreact.entities.ScorePk;
import com.diego.springreact.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


/*
classe de acesso aos dados
 */
public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
}
