package com.diego.springreact.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    private Double score;
    private  Integer count;
    private  String image;

    @OneToMany(mappedBy = "id.movie")
    private Set<Score> scores = new HashSet<Score>();

    public Set<Score> getScores() {
        return scores;
    }
}
