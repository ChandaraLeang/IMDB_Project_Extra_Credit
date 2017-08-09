package cs544.mum.edu.EA.domain;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * Class: Actor
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Actor {
	@Id
	@GeneratedValue
	private int actorId;
	@NotBlank
	@Column
	private String firstname;
	@NotBlank
	@Column
	private String lastname;
	@NotBlank
	@Column
	private Date DOB;
	@NotBlank
	@Column
	private String POB;
	@NotBlank
	@Column
	private String biography;
	
	@OneToMany(mappedBy = "actor")
	private List<Role> characters;
	
	@ManyToMany(mappedBy = "actors")
	private List<Movie> movies = new ArrayList<Movie>();

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getPOB() {
		return POB;
	}

	public void setPOB(String pOB) {
		POB = pOB;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<Role> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Role> characters) {
		this.characters = characters;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}