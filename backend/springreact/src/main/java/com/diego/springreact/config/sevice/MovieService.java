package com.diego.springreact.config.sevice;


import com.diego.springreact.dto.MovieDTO;
import com.diego.springreact.entities.Movie;
import com.diego.springreact.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class MovieService {

    //injeção de depedencia
    @Autowired
    private MovieRepository repository;


    //metodo retorna  os filmes em paginação
    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){

       Page<Movie> listResult =  repository.findAll(pageable);
       Page<MovieDTO> page  = listResult.map(x -> new MovieDTO(x) );//-> converção dos dados
       return page;

    }


}
