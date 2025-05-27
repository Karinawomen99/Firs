package Fourth;

import dz13.Fourth.Movie;
import dz13.Fourth.MovieService;
import dz13.Fourth.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    @Test
    void testAddRating() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Побег",2024);
        service.addRating(movie,new Rating<Number>(5));
        assertEquals(5.0,service.getAverageRating(movie));

    }
    @Test
    void testInavalidRating(){
        MovieService service = new MovieService();
        Movie movie = new Movie("Побег 2",2025);
        assertThrows(IllegalArgumentException.class,()->service.addRating(movie,new Rating<Number>(11)));
    }



}
