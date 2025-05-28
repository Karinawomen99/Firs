package dz13.Fourth4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<?>>> movieRatings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<?> rating) {
        if (rating.getValue().doubleValue() < 1 || rating.getValue().doubleValue() > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть от 1 до 10");
        }
        {
            movieRatings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
        }

    }
    public double getAverageRating(Movie movie){
        List<Rating<?>> ratings = movieRatings.get(movie);
            if (ratings == null || ratings.isEmpty()){
                return 0;
            }
            return ratings.stream().mapToDouble(r->r.getValue().doubleValue()).average().orElse(0);
        }
    public List<Movie>getMoviesSorterByRating(){
        return movieRatings.keySet().stream().sorted(Comparator.comparingDouble(this::getAverageRating).reversed()).collect(Collectors.toList());
    }
    }


