package cs544.mum.edu.EA.dao;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * Class: MovieDao
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cs544.mum.edu.EA.domain.Movie;

@Service
public class MovieDao implements IMovieDao{
	
	private Map<Integer, Movie> movies = new HashMap<Integer, Movie>();

	public MovieDao() {
		add(new Movie("The Fast and the Furious", "The Fast and the Furious is an American franchise based on a series of action films that is largely concerned with illegal street racing and heists, and includes material in various other media that depicts characters and situations from the films."));
		add(new Movie("Mission: Impossible", "When U.S. government operative Ethan Hunt (Tom Cruise) and his mentor, Jim Phelps (Jon Voight), go on a covert assignment that takes a disastrous turn, Jim is killed, and Ethan becomes the prime murder suspect. Now a fugitive, Hunt recruits brilliant hacker Luther Stickell (Ving Rhames) and maverick pilot Franz Krieger (Jean Reno) to help him sneak into a heavily guarded CIA building to retrieve a confidential computer file that will prove his innocence."));
	}
	
	public List<Movie> getAll() {
		return new ArrayList<Movie>(movies.values());
	}

	public void add(Movie movie) {
		((MovieDao) movies).add(movie);
	}

	public Movie get(int movieId) {
		Movie result = movies.get(movieId);
		return result;
	}

	public void update(int movieId, Movie movie) {
		movies.put(movieId, movie);
	}

	public void delete(int movieId) {
		Movie removed = movies.remove(movieId);
	}
	
}
