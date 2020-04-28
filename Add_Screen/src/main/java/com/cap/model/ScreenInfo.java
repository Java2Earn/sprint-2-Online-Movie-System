package com.cap.model;

public class ScreenInfo {

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Integer rows;
	private Integer columns;
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
		return "ScreenInfo [screenId=" + screenId + ", theatreId=" + theatreId + ", screenName=" + screenName
				+ ", rows=" + rows + ", columns=" + columns + "]";
	}	
}