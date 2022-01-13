package com.diego.springreact.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
public class ScoreDTO {

    private Long MovieId;
    private String email;
    private Double score;

}
