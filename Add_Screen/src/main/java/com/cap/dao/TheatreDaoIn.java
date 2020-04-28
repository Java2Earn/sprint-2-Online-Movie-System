package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Theatre;

public interface TheatreDaoIn  extends JpaRepository<Theatre, Integer>{

}