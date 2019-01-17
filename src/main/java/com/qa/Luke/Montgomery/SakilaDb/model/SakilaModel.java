package com.qa.Luke.Montgomery.SakilaDb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "film")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "last_update"}, allowGetters = true)
public class SakilaModel implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private Long film_id;
	@NotBlank
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "release_year")
	private Integer release_year;
	@NotBlank
	@Column(name = "language_id")
	private Integer languageId;
	

	@Column(name = "original_language_id")
	private Integer original_language_id;
	@NotBlank
	@Column(name = "rental_duration")
	private Integer rental_duration;
	@NotBlank
	@Column(name = "rental_rate")
	private Integer rentalRate;
	@Column(name = "length" )
	private Integer length;
	@NotBlank
	@Column(name = "replacement_cost" )
	private Integer replacementCost;
	@Column(name = "rating" )
	private String rating;
	@Column(name = "special_feature" )
	private String specialFeatures;

	@Column(nullable = false, name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastModifed;
	
	
	public SakilaModel(Long film_id, String title, String description, Integer release_year, Integer languageId,
			Integer original_language_id, Integer rental_duration, Integer rentalRate, Integer length,
			Integer replacementCost, String rating, String specialFeatures, Date lastModifed) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.languageId = languageId;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.lastModifed = lastModifed;
	}
	
	public SakilaModel() {
		
	}

	public Long getFilmId() {
		return film_id;
	}


	public void setFilmId(Long filmId) {
		this.film_id = filmId;
	}
	public Long getFilm_id() {
		return film_id;
	}


	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}


	public Integer getOriginal_language_id() {
		return original_language_id;
	}


	public void setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
	}


	public Integer getRental_duration() {
		return rental_duration;
	}


	public void setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
	}


	public Integer getRentalRate() {
		return rentalRate;
	}


	public void setRentalRate(Integer rentalRate) {
		this.rentalRate = rentalRate;
	}


	public Integer getReplacementCost() {
		return replacementCost;
	}


	public void setReplacementCost(Integer replacementCost) {
		this.replacementCost = replacementCost;
	}


	public String getSpecialFeatures() {
		return specialFeatures;
	}


	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
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


	public Integer getRelease_year() {
		return release_year;
	}


	public void setRelease_year(Integer release_year) {
		this.release_year = release_year;
	}


	public Integer getLanguageId() {
		return languageId;
	}


	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}


	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public Date getLastModifed() {
		return lastModifed;
	}


	public void setLastModifed(Date lastModifed) {
		this.lastModifed = lastModifed;
	}
}
