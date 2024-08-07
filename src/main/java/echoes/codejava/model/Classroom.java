package echoes.codejava.model;
// Generated 24 Jul, 2024 12:05:34 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classroom generated by hbm2java
 */
@Entity
@Table(name = "classroom", catalog = "myschool")
public class Classroom implements java.io.Serializable {

	private int classroomId;
	private Integer capacity;
	private Integer roomType;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	private Set classes = new HashSet(0);

	public Classroom() {
	}

	public Classroom(int classroomId) {
		this.classroomId = classroomId;
	}

	public Classroom(int classroomId, Integer capacity, Integer roomType, String description, Date createdAt,
			Date updatedAt, Set classes) {
		this.classroomId = classroomId;
		this.capacity = capacity;
		this.roomType = roomType;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.classes = classes;
	}

	@Id

	@Column(name = "classroom_id", unique = true, nullable = false)
	public int getClassroomId() {
		return this.classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	@Column(name = "capacity")
	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Column(name = "room_type")
	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classroom")
	public Set getClasses() {
		return this.classes;
	}

	public void setClasses(Set classes) {
		this.classes = classes;
	}

}
