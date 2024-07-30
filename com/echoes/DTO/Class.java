package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Class generated by hbm2java
 */
public class Class implements java.io.Serializable {

	private int classId;
	private Classroom classroom;
	private Subject subject;
	private Teacher teacher;
	private String className;
	private String section;
	private Date createdAt;
	private Date updatedAt;
	private Set classStudents = new HashSet(0);

	public Class() {
	}

	public Class(int classId) {
		this.classId = classId;
	}

	public Class(int classId, Classroom classroom, Subject subject, Teacher teacher, String className, String section,
			Date createdAt, Date updatedAt, Set classStudents) {
		this.classId = classId;
		this.classroom = classroom;
		this.subject = subject;
		this.teacher = teacher;
		this.className = className;
		this.section = section;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.classStudents = classStudents;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public Classroom getClassroom() {
		return this.classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
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

	public Set getClassStudents() {
		return this.classStudents;
	}

	public void setClassStudents(Set classStudents) {
		this.classStudents = classStudents;
	}

}
