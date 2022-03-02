package com.example.pimp_my_car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PimpMyCarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PimpMyCarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
