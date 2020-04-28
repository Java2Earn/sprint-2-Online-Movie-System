package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.DeleteMovieDaoIn;

@Service
@Transactional
public class DeleteMovieService implements DeleteMovieServiceIn{
	@Autowired
	private DeleteMovieDaoIn dao;

	@Override
	public void deleteMovie(int id) {
		dao.deleteById(id);
	}
}
