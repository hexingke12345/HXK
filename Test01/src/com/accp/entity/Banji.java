package com.accp.entity;

import java.sql.Date;
import java.sql.Timestamp;

import com.accp.annotation.Column;
import com.accp.annotation.Table;

@Table(name="class",description="班级管理表")
public class Banji {
	
	@Column(name="classId",isPrimaryKey=true)
	private Integer classId;
	
	@Column(name="className",isPrimaryKey=false)
	private String className;
	
	@Column(name="gradeId",isPrimaryKey=false)
	private Integer gradeId;
	
	@Column(name="classNum",isPrimaryKey=false)
	private Integer classNum;
	
	@Column(name="classDate",isPrimaryKey=false)
	private String classDate;
	
	@Column(name="classTeacher",isPrimaryKey=false)
	private String classTeacher;
	
	@Column(name="teacher",isPrimaryKey=false)
	private String teacher;
	
	/*@Column(name="classStatus",isPrimaryKey=false)
	private Integer classStatus;*/
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getClassNum() {
		return classNum;
	}
	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}
	public String getClassDate() {
		return classDate;
	}
	public void setClassDate(String classDate) {
		this.classDate = classDate;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	/*public Integer getClassStatus() {
		return classStatus;
	}
	public void setClassStatus(Integer classStatus) {
		this.classStatus = classStatus;
	}*/
	public Banji(Integer classId, String className, Integer gradeId, Integer classNum, String classDate,
			String classTeacher, String teacher) {
		super();
		this.classId = classId;
		this.className = className;
		this.gradeId = gradeId;
		this.classNum = classNum;
		this.classDate = classDate;
		this.classTeacher = classTeacher;
		this.teacher = teacher;
		//this.classStatus = classStatus;
	}
	public Banji() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
