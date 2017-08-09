package cs544.mum.edu.EA.domain;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * Class: Movie
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private int movieId;
	@NotBlank
	@Column
	private String title;
	@NotBlank
	@Column
	private String description;
	
	@OneToMany
	@JoinTable(name = "movies_genre", joinColumns = @JoinColumn(name = "movieId"),
			inverseJoinColumns = @JoinColumn(name = "genreId"))
	private List<Genre> genres;
	
	@ElementCollection
	private Set<String> ratings = new HashSet<String>();
	
	@ElementCollection
	private Set<String> comments = new HashSet<String>();
	
	@ManyToMany
	@JoinTable(name = "actors_movies", 
			joinColumns = @JoinColumn(name = "movieId"),
			inverseJoinColumns = @JoinColumn(name = "actorId"))
	private List<Actor> actors = new ArrayList<Actor>();

	@ManyToMany
	@JoinTable(name = "directors_movies", 
			joinColumns = @JoinColumn(name = "movieId"),
			inverseJoinColumns = @JoinColumn(name = "directorId"))
	private List<Director> directors = new ArrayList<Director>();
	
	@OneToMany(mappedBy = "movie")
	private List<Role> characters;

	public Movie(){
		
	}
	
	public Movie(String title, String description){
		this.title = title;
		this.description = description;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public Set<String> getRatings() {
		return ratings;
	}

	public void setRatings(Set<String> ratings) {
		this.ratings = ratings;
	}

	public Set<String> getComments() {
		return comments;
	}

	public void setComments(Set<String> comments) {
		this.comments = comments;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<Role> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Role> characters) {
		this.characters = characters;
	}
}