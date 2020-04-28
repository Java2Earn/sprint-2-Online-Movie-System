package com.cap.model;

import java.sql.Time;

public class ShowInfo {

	private Integer showId;
	private Time showStartTime;
	private Time showEndTime;
	private String showName;
	private Integer movieId;
	private String movieName;
	private Integer screenId;
	private Integer theatreId;
	
	
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Time getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Time getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "ShowInfo [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showName=" + showName + ", movieId=" + movieId + ", movieName=" + movieName + ", screenId="
				+ screenId + ", theatreId=" + theatreId + "]";
	}		
}