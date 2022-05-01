package pl.kamis83.moviesdirectory;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class MovieService {
    public List<Movie> getMovies() {
        return Arrays.asList(
                new Movie("Batman"),
                new Movie("Rocky")

        );
    }

    public Movie getMovie(UUID id) {
        Movie movie = new Movie("Movie" + id);
        return movie;
    }

    public Movie createMovie(Movie movie) {
        movie.setId(UUID.randomUUID());
        //TODO save movie
        return movie;
    }

    public Movie updateMovie(UUID id, Movie movie) {
        movie.setId(id);
        return movie;
    }

    public void deleteMovie(UUID id) {
        //TODO delete movie
    }
}
