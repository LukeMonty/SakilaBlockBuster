package com.qa.Luke.Montgomery.SakilaDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Luke.Montgomery.SakilaDb.model.SakilaFilmListModel;
import com.qa.Luke.Montgomery.SakilaDb.repository.SakilaFilmListRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SakilaFilmListController {
	
	@Autowired
	SakilaFilmListRepository myRepository;
	
	@GetMapping("/filmList")
	public List<SakilaFilmListModel> getAllFilms() {
		return myRepository.findAll();
	}
	
	@GetMapping("/filmList/{title}")
	public SakilaFilmListModel getByTitle(@PathVariable(value = "title") String titles) {
		return myRepository.findByTitle(titles);
	}
	@GetMapping("/filmList/{actors}")
	public SakilaFilmListModel getByActors(@PathVariable(value = "actors") String actors) {
		return myRepository.findByTitle(actors);
	}
	@GetMapping("/filmList/{category}")
	public List<SakilaFilmListModel> getByCategory(@PathVariable(value = "category") String category){
		return myRepository.findByCategory(category);
	}

}
