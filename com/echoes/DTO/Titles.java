package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * Titles generated by hbm2java
 */
public class Titles implements java.io.Serializable {

	private TitlesId id;
	private Employees employees;
	private Date toDate;

	public Titles() {
	}

	public Titles(TitlesId id, Employees employees) {
		this.id = id;
		this.employees = employees;
	}

	public Titles(TitlesId id, Employees employees, Date toDate) {
		this.id = id;
		this.employees = employees;
		this.toDate = toDate;
	}

	public TitlesId getId() {
		return this.id;
	}

	public void setId(TitlesId id) {
		this.id = id;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
