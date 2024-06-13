package com.example.moview_review_system.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

    private int id;
    private String name;
}
