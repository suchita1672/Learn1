package com.BikkadIT.SterioTypeAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SterioTypeAnnotations.controller.WelcomeController;
import com.BikkadIT.SterioTypeAnnotations.model.Student;

@SpringBootApplication
public class SterioTypeAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SterioTypeAnnotationApplication.class, args);
		
		WelcomeController welcomeController = run.getBean(WelcomeController.class);
		
		Student stu= new Student();
		stu.setSid(11);
		stu.setSname("Suchita");
		stu.setSaddress("Pune");
		
		//WelcomeController welcomeController = new WelcomeController();
		Student stu1= welcomeController.saveStudentController(stu);
		System.out.println(stu1);
	
		
	}

}
