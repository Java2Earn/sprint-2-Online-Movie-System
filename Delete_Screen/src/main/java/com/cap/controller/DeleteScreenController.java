package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.service.DeleteScreenServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class DeleteScreenController {

	@Autowired
	private DeleteScreenServiceIn service;
	

	
	@DeleteMapping("/deleteScreen/{id}")
	public void deleteScreen(@PathVariable ("id") int id) {
		service.deleteScreen(id);
	}
}