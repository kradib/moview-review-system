package com.example.moview_review_system.repository;

import com.example.moview_review_system.dao.MovieDao;
import com.example.moview_review_system.model.Movie;
import com.example.moview_review_system.rowmapper.MovieRowMapper;
import lombok.NonNull;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    private final MovieDao movieDao;

    public MovieRepository(@NonNull final Jdbi jdbi) {
        jdbi.registerRowMapper(Movie.class, new MovieRowMapper());
        this.movieDao = jdbi.onDemand(MovieDao.class);
    }

    public List<Movie> getMovies() {
        return movieDao.getAllMovies();
    }


}
