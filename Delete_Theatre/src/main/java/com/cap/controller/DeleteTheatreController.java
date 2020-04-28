package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.service.DeleteTheatreServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class DeleteTheatreController {

	@Autowired
	private DeleteTheatreServiceIn service;
	

	
	@DeleteMapping("/deleteTheatre/{id}")
	public void deleteTheatre(@PathVariable ("id") int id) {
		service.deleteTheatre(id);
	}
}