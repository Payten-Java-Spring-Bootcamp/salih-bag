package com.example.week2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Movie {
    private int id;
    private String name;
    private List<Genres> genres;
    private String director;
    private String releaseYear;
    private List<String> cast;
    private Double rating;
}