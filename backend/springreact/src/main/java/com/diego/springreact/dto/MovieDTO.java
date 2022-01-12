package com.diego.springreact.dto;


import com.diego.springreact.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieDTO {

    private Long id;
    private  String title;
    private Double score;
    private  Integer count;
    private  String image;

   //tranferencia de dados do movie para movie dto
    public MovieDTO (Movie movie){

        id= movie.getId();
        title = movie.getTitle();
        score = movie.getScore();
        count = movie.getCount();
        image = movie.getImage();

    }
}
