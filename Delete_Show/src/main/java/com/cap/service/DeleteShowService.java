package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.DeleteShowDaoIn;

@Service
@Transactional
public class DeleteShowService implements DeleteShowServiceIn{
	@Autowired
	private DeleteShowDaoIn dao;

	@Override
	public void deleteShow(int id) {
		dao.deleteById(id);
	}
}