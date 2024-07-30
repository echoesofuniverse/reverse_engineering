package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * DeptEmp generated by hbm2java
 */
public class DeptEmp implements java.io.Serializable {

	private DeptEmpId id;
	private Departments departments;
	private Employees employees;
	private Date fromDate;
	private Date toDate;

	public DeptEmp() {
	}

	public DeptEmp(DeptEmpId id, Departments departments, Employees employees, Date fromDate, Date toDate) {
		this.id = id;
		this.departments = departments;
		this.employees = employees;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public DeptEmpId getId() {
		return this.id;
	}

	public void setId(DeptEmpId id) {
		this.id = id;
	}

	public Departments getDepartments() {
		return this.departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
