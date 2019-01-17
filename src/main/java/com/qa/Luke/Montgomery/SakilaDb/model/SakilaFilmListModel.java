package com.qa.Luke.Montgomery.SakilaDb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "film_list")
@EntityListeners(AuditingEntityListener.class)
public class SakilaFilmListModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FID")
	private Long film_id;
	@Column(name = "title")
	private String title;
	@NotBlank
	@Column(name = "description")
	private String description;
	@Column(name = "category")
	private String category;
	@Column(name = "price")
	private Integer price;
	@Column(name = "length")
	private Integer length;
	@Column(name = "rating")
	private String rating;
	@Column(name = "actors")
	private String actors;
	
	public SakilaFilmListModel() {}
	
	public SakilaFilmListModel(Long film_id, String title, @NotBlank String description, Integer category,
			Integer price, Integer length, String rating, String actors) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.length = length;
		this.rating = rating;
		this.actors = actors;
	}
	public Long getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
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
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}

}
