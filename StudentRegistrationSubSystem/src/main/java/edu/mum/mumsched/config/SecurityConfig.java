package edu.mum.mumsched.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration  //lets spring know that this file contains  configuration information.
@EnableWebSecurity //Require the user to be authenticated prior to accessing any URL within our application

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/register").permitAll()
			.antMatchers("/confirm").permitAll();
		 
	}

}

/*
 * WebSecurityConfigurerAdapter:
    In spring Boot, Configurer Adapters are classes that construct 
    default bean configurations and contain empty methods which are
    meant to be overridden 
    
    *
    *
    */
