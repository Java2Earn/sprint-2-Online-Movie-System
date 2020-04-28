package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.DeleteScreenDaoIn;

@Service
@Transactional
public class DeleteScreenService implements DeleteScreenServiceIn{
	@Autowired
	private DeleteScreenDaoIn dao;

	@Override
	public void deleteScreen(int id) {
		dao.deleteById(id);
	}
}