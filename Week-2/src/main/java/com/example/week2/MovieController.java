package com.example.week2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {


    @GetMapping("/movies")
    public List<Movie> retrieveMovies() {
        return Movies.movieList;
    }

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public String addMovie(@RequestBody Movie movie) {
        Movies.movieList.add(
                Movie.builder()
                        .id(movie.getId())
                        .name(movie.getName())
                        .director(movie.getDirector())
                        .genres(movie.getGenres())
                        .cast(movie.getCast())
                        .releaseYear(movie.getReleaseYear())
                        .rating(movie.getRating())
                        .build()
        );

        return "Listedeki film sayısı " + Movies.movieList.size();
    }
    @DeleteMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMovie() {

    }


}
