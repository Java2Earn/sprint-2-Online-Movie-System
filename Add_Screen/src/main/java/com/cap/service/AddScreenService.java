package com.cap.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AddScreenDaoIn;
import com.cap.dao.TheatreDaoIn;
import com.cap.bean.Screen;
import com.cap.bean.Theatre;
import com.cap.model.ScreenInfo;


@Service
@Transactional
public class AddScreenService implements AddScreenServiceIn {

	@Autowired
  private AddScreenDaoIn dao;
	
	@Autowired
	  private TheatreDaoIn theatreDaoIn;
	

	@Override
	public ScreenInfo addScreen(ScreenInfo screenInfo) {
		
		Optional<Theatre>  theatre = theatreDaoIn.findById(screenInfo.getTheatreId());
		
		Screen screen = new Screen();
		screen.setTheatre(theatre.get());
		screen.setRows(screenInfo.getRows());
		screen.setColumns(screenInfo.getColumns());
		screen.setScreenName(screenInfo.getScreenName());
		
		screen = dao.save(screen);
		
		screenInfo.setScreenId(screen.getScreenId());
		return screenInfo;
	}
}