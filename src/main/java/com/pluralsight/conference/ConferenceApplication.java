package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    System.out.println("inside startup method");
  }
}
