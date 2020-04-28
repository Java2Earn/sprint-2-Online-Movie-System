package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.bean.Movie;
import com.cap.service.DeleteMovieServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class DeleteMovieController {

	@Autowired
	private DeleteMovieServiceIn service;
	

	
	@DeleteMapping("/deleteMovie/{id}")
	public void deleteMovie(@PathVariable ("id") int id) {
		service.deleteMovie(id);
	}
}
