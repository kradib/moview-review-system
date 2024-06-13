package com.example.moview_review_system.rowmapper;

import com.example.moview_review_system.dao.MovieDao;
import com.example.moview_review_system.model.Movie;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {


    @Override
    public Movie map(ResultSet rs, StatementContext ctx) throws SQLException {
        return Movie.builder()
                .id(rs.getInt(MovieDao.Constants.COLUMN_ID))
                .name(rs.getString(MovieDao.Constants.COLUMN_MOVIE_NAME))
                .build();
    }
}
