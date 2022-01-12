package com.diego.springreact.controller;

import com.diego.springreact.config.sevice.MovieService;
import com.diego.springreact.config.sevice.ScoreService;
import com.diego.springreact.dto.MovieDTO;
import com.diego.springreact.dto.ScoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private MovieService service;

    @Autowired
    private ScoreService scoreService;



    @PutMapping
    public MovieDTO saveScore(@RequestBody  ScoreDTO dto){
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return movieDTO;

    }


}
