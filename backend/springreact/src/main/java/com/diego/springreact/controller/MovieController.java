package com.diego.springreact.controller;


import com.diego.springreact.config.sevice.MovieService;
import com.diego.springreact.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {


    @Autowired
    private MovieService service;

    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable){
        return service.findAll(pageable);

    }
}
