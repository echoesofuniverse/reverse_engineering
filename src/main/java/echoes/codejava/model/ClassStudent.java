package echoes.codejava.model;
// Generated 24 Jul, 2024 12:05:34 PM by Hibernate Tools 5.0.6.Final
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * ClassStudent generated by hbm2java
 */
@Entity
@Table(name = "class_student", catalog = "myschool")
public class ClassStudent implements java.io.Serializable {

	private long classStudentId;
	private Class class_;
	private Student student;

	public ClassStudent() {
	}

	public ClassStudent(long classStudentId) {
		this.classStudentId = classStudentId;
	}

	public ClassStudent(long classStudentId, Class class_, Student student) {
		this.classStudentId = classStudentId;
		this.class_ = class_;
		this.student = student;
	}

	@Id

	@Column(name = "class_student_id", unique = true, nullable = false)
	public long getClassStudentId() {
		return this.classStudentId;
	}

	public void setClassStudentId(long classStudentId) {
		this.classStudentId = classStudentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public Class getClassInfo() {
		return this.class_;
	}

	public void setClass(Class class_) {
		this.class_ = class_;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
