package com.cap.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="screen")

public class Screen {

	@Id
	@GeneratedValue
	
	private Integer screenId;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="THEATRE_ID")
	private Theatre theatre;
	
	private String screenName;
	private Integer rows;
	private Integer columns;
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatre=" + theatre + ", screenName=" + screenName + ", rows=" + rows
				+ ", columns=" + columns + "]";
	}
	
	
}
