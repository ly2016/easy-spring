package com.ly.easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*@SpringBootApplication
public class EasySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasySpringApplication.class, args);
	}
}*/

@SpringBootApplication
public class EasySpringApplication extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EasySpringApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(EasySpringApplication.class, args);
    }
}
