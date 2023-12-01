package com.BikkadIT.SterioTypeAnnotation.dao;

import org.springframework.stereotype.Repository;

import com.BikkadIT.SterioTypeAnnotations.model.Student;

@Repository
public class WelcomeDao {
	public WelcomeDao() {
		super();
		System.out.println("WelcomeDao Class Constructor");
	}
	public void welDao() {
		System.out.println("It will take data from service layer and send to DataBase ");
	}
	public Student saveStudentDao(Student stu) {
		System.out.println(stu);
		return stu;
	}

}
