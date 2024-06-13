package com.example.moview_review_system.controller;


import com.example.moview_review_system.model.Movie;
import com.example.moview_review_system.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
@Slf4j
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getMovies() {
        log.info("Received request to fetch all movies");
        return ResponseEntity.ok(movieService.getMovies());

    }

}
