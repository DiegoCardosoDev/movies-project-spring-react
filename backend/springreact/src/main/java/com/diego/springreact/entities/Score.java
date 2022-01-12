package com.diego.springreact.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private  ScorePk id = new ScorePk();
    private  Double value;

    //associar score ao filme
    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User  user) {
        id.setUser(user);
    }
}
