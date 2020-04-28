package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.service.DeleteShowServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class DeleteShowController {

	@Autowired
	private DeleteShowServiceIn service;
	

	
	@DeleteMapping("/deleteShow/{id}")
	public void deleteShow(@PathVariable ("id") int id) {
		service.deleteShow(id);
	}
}