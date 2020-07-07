package com.jesperapps.loginuser;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories
public class UserloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserloginApplication.class, args);
	}

}
