package com.diego.springreact.config.sevice;



import com.diego.springreact.dto.MovieDTO;
import com.diego.springreact.dto.ScoreDTO;
import com.diego.springreact.entities.Movie;
import com.diego.springreact.entities.Score;
import com.diego.springreact.entities.User;
import com.diego.springreact.repositories.MovieRepository;
import com.diego.springreact.repositories.ScoreRepository;
import com.diego.springreact.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class    ScoreService {

    //injeção de depedencia
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;


    //logica para salvar avaliação
    @Transactional
    public MovieDTO saveScore(ScoreDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();
        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum =0;
        for (Score s : movie.getScores()){
            sum=sum + s.getValue();

        }

        double avg = sum / movie.getScores().size();
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());


        movie = movieRepository.save(movie);
        return new MovieDTO(movie);



    }



}
