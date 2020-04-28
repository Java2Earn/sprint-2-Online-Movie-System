package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.DeleteTheatreDaoIn;

@Service
@Transactional
public class DeleteTheatreService implements DeleteTheatreServiceIn{
	@Autowired
	private DeleteTheatreDaoIn dao;

	@Override
	public void deleteTheatre(int id) {
		dao.deleteById(id);
	}
}