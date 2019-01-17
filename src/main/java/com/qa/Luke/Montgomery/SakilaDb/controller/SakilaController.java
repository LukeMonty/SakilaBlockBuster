package com.qa.Luke.Montgomery.SakilaDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Luke.Montgomery.SakilaDb.model.SakilaModel;
import com.qa.Luke.Montgomery.SakilaDb.repository.SakilaRepository;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class SakilaController {
	
	@Autowired
	SakilaRepository myRepository;
	
	@GetMapping("/film")
	public List<SakilaModel> getAllFilms() {
		return myRepository.findAll();
	}
	
	@GetMapping("/film/{title}")
	public SakilaModel getByTitle(@PathVariable(value = "title") String titles) {
		return myRepository.findByTitle(titles);
	}

}