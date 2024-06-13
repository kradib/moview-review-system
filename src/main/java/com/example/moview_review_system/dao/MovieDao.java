package com.example.moview_review_system.dao;

import com.example.moview_review_system.model.Movie;
import lombok.NoArgsConstructor;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface MovieDao {

    @SqlQuery(Constants.SQL_GET_ALL_MOVIES)
    List<Movie> getAllMovies();

    @NoArgsConstructor
    final class Constants {
        public static final String TABLE_NAME = "movie";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_MOVIE_NAME = "name";

        /**
         * SELECT * FROM movies
         */
        static final String SQL_GET_ALL_MOVIES = "SELECT * FROM movies";
    }
}
