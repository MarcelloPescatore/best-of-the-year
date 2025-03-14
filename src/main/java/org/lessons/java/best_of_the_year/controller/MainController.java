package org.lessons.java.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        String ilMioNome = "Marcello";
        model.addAttribute("name", ilMioNome);

        return "home";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1,"Inception"));
        movies.add(new Movie(2,"The Matrix"));
        movies.add(new Movie(3,"Interstellar"));
        movies.add(new Movie(4,"Fight Club"));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1,"Bohemian Rhapsody"));
        songs.add(new Song(2,"Stairway to Heaven"));
        songs.add(new Song(3,"Hotel California"));
        songs.add(new Song(4,"Smells Like Teen Spirit"));
        return songs;
    }

    @GetMapping("/movies")
    public String movies(Model model){
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

}
