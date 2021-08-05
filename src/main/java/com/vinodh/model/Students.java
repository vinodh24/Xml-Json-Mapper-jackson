package com.vinodh.model;

import java.util.List;

public class Students {
	
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Students [student=" + student + "]";
	}
}
