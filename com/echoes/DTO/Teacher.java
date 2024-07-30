package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Teacher generated by hbm2java
 */
public class Teacher implements java.io.Serializable {

	private int teacherId;
	private String teacherCode;
	private String teacherFullName;
	private Short gender;
	private Date dob;
	private String email;
	private String phone;
	private Short isActive;
	private Date joinDate;
	private Short workingDays;
	private Date createdAt;
	private Date updatedAt;
	private Set classes = new HashSet(0);

	public Teacher() {
	}

	public Teacher(int teacherId) {
		this.teacherId = teacherId;
	}

	public Teacher(int teacherId, String teacherCode, String teacherFullName, Short gender, Date dob, String email,
			String phone, Short isActive, Date joinDate, Short workingDays, Date createdAt, Date updatedAt,
			Set classes) {
		this.teacherId = teacherId;
		this.teacherCode = teacherCode;
		this.teacherFullName = teacherFullName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.isActive = isActive;
		this.joinDate = joinDate;
		this.workingDays = workingDays;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.classes = classes;
	}

	public int getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherCode() {
		return this.teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getTeacherFullName() {
		return this.teacherFullName;
	}

	public void setTeacherFullName(String teacherFullName) {
		this.teacherFullName = teacherFullName;
	}

	public Short getGender() {
		return this.gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Short getWorkingDays() {
		return this.workingDays;
	}

	public void setWorkingDays(Short workingDays) {
		this.workingDays = workingDays;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set getClasses() {
		return this.classes;
	}

	public void setClasses(Set classes) {
		this.classes = classes;
	}

}
