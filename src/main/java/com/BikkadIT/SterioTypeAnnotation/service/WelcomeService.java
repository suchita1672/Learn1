package com.BikkadIT.SterioTypeAnnotation.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.SterioTypeAnnotation.dao.WelcomeDao;
import com.BikkadIT.SterioTypeAnnotations.model.Student;

@Service
public class WelcomeService {

	public WelcomeService() {
		super();
		System.out.println("WelcomeService Class Constructor");
	}
	public void welService() {
		System.out.println("It will take data from controller layer and send to Dao Layer");
		WelcomeDao welcomeDao = new WelcomeDao();
		welcomeDao.welDao();
	}
	public Student saveStudentService(Student stu) {
		WelcomeDao welcomeDao = new WelcomeDao();
		Student stu1 = welcomeDao.saveStudentDao(stu);
		
		return stu1;
	}
	
	}


