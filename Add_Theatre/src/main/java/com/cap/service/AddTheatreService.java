package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AddTheatreDaoIn;
import com.cap.bean.Theatre;


@Service
@Transactional
public class AddTheatreService implements AddTheatreServiceIn {

	@Autowired
  private AddTheatreDaoIn dao;
	

	@Override
	public Theatre addTheatre(Theatre theatre) {
		return dao.save(theatre);
	}
}
