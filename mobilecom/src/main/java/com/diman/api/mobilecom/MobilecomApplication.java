package com.diman.api.mobilecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaAuditing
public class MobilecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilecomApplication.class, args);
	}

}
