package com.example.moview_review_system.service;

import com.example.moview_review_system.model.Movie;
import com.example.moview_review_system.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }
}
