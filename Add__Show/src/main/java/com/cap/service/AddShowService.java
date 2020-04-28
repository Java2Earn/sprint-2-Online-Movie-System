package com.cap.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AddShowDaoIn;
import com.cap.dao.MovieDao;
import com.cap.bean.Movie;
import com.cap.bean.Show;
import com.cap.model.ShowInfo;



@Service
@Transactional
public class AddShowService implements AddShowServiceIn {

	@Autowired
  private AddShowDaoIn dao;
	
	@Autowired
	  private MovieDao movieDao;
	

	@Override
	public ShowInfo addShow(ShowInfo showInfo) {
		
		Optional<Movie> movie = movieDao.findById(showInfo.getMovieId());
		Show show = new Show();
		show.setMovie(movie.get());
		show.setScreenId(showInfo.getScreenId());
		show.setShowEndTime(showInfo.getShowEndTime());
		show.setShowStartTime(showInfo.getShowStartTime());
		show.setShowName(showInfo.getShowName());
		show.setTheatreId(showInfo.getTheatreId());
		
		show = dao.save(show);
		
		showInfo.setMovieName(show.getMovie().getMovieName());
		showInfo.setShowId(show.getShowId());
		
		return showInfo;
	}
}