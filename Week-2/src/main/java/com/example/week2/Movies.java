package com.example.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movies {
    //neden static yapmamız gerekti?
    public static ArrayList<Movie> movieList = new ArrayList<>(Arrays.asList(
            Movie.builder()
                    .id(1)
                    .name("Don't Look Up")
                    .cast(List.of(
                            "Leonardo DiCaprio",
                            "Jennifer Lawrence",
                            "Meryl Streep",
                            "Cate Blanchett",
                            "Rob Morgan",
                            "Jonah Hill"
                    ))
                    .rating(7.3)
                    .releaseYear("2021")
                    .genres(List.of(Genres.COMEDY, Genres.DRAMA, Genres.SCIFI))
                    .director("Adam McKay")
                    .build(),
            Movie.builder()
                    .id(2)
                    .name("Spider-Man: No Way Home")
                    .releaseYear("2021")
                    .genres(List.of(Genres.ACTION, Genres.ADVENTURE, Genres.FANTASY, Genres.SCIFI))
                    .rating(8.8)
                    .cast(List.of(
                            "Tom Holland",
                            "Zendaya",
                            "Benedict Cumberbatch",
                            "Jacob Batalon",
                            "Jon Favreau",
                            "Jamie Foxx"
                    ))
                    .director("Jon Watts")
                    .build(),
            Movie.builder()
                    .id(3)
                    .name("Matrix Resurrections")
                    .releaseYear("2021")
                    .genres(List.of(Genres.ACTION, Genres.SCIFI))
                    .rating(5.7)
                    .cast(List.of(
                            "Keanu Reeves",
                            "Carrie-Anne Moss",
                            "Yahya Abdul-Mateen II",
                            "Jonathan Groff",
                            "Jessica Henwick",
                            "Neil Patrick Harris"
                    ))
                    .director("Lana Wachowski")
                    .build()
    ));

}
