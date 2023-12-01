package com.BikkadIT.SterioTypeAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.SterioTypeAnnotation.service.WelcomeService;
import com.BikkadIT.SterioTypeAnnotations.model.Student;

//@RestController
@Controller
public class WelcomeController {
	

	public WelcomeController() {
		super();
		System.out.println("WelcomeController Class Constructor");
	}
	public void welController() {
		System.out.println("It will take data from UI layer and send to ServiceLayer");
	
		WelcomeService welcomeService = new WelcomeService();
		welcomeService.welService();
	}
	public Student saveStudentController(Student stu) {
		
		WelcomeService welcomeService = new WelcomeService();
		
		Student stu1 = welcomeService.saveStudentService(stu);
		return stu1;
	
	
	}

}
