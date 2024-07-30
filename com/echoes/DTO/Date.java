package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * Date generated by hbm2java
 */
public class Date implements java.io.Serializable {

	private Date date;
	private Date cyDate;
	private Integer year;
	private String monthName;
	private String dateYyMmm;

	public Date() {
	}

	public Date(Date date) {
		this.date = date;
	}

	public Date(Date date, Date cyDate, Integer year, String monthName, String dateYyMmm) {
		this.date = date;
		this.cyDate = cyDate;
		this.year = year;
		this.monthName = monthName;
		this.dateYyMmm = dateYyMmm;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getCyDate() {
		return this.cyDate;
	}

	public void setCyDate(Date cyDate) {
		this.cyDate = cyDate;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getMonthName() {
		return this.monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public String getDateYyMmm() {
		return this.dateYyMmm;
	}

	public void setDateYyMmm(String dateYyMmm) {
		this.dateYyMmm = dateYyMmm;
	}

}
