package com.ss.service;

import java.util.ArrayList;
import java.util.List;

import com.ss.Student;

public class StudentServiceImpl implements StudentService {

	List<Student> student = new ArrayList();

	public void addStudent(Student s) {
		student.add(s);
	}

	public Student getStudent() {
		Student s = new Student();
		s.setfName("BK");
		s.setlName("Pedada");
		return s;
	}

}
