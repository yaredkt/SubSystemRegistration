package edu.mum.mumsched;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication   // @Configuration @EnableAutoConfiguration @componentScan
public class StudentRegistrationSubSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationSubSystemApplication.class, args);
	}
}

/*
 *
 @configuration: 
 
 @EnableAutoConfiguration:
   Spring Boot looks at a) Frameworks available on the CLASSPATH 
    b) Existing configuration for the application. Based on these, 
    Spring Boot provides basic configuration needed to configure 
    the application with these frameworks
    
@SpringBootApplication containing the @SpringBoot main class) and its sub packages.

@ComponentScan tell Spring the packages to scan for annotated components. where to search
    @ComponentScan("edu.mum.addmission")
*
*
*/