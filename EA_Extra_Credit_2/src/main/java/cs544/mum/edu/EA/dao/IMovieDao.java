package cs544.mum.edu.EA.dao;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * interface: IMovieDao
 */

import java.util.List;

import cs544.mum.edu.EA.domain.Movie;

public interface IMovieDao {
	
	public abstract List<Movie> getAll();

	public abstract void add(Movie movie);

	public abstract Movie get(int movieId);

	public abstract void update(int movieId, Movie movie);

	public abstract void delete(int movieId);
}
