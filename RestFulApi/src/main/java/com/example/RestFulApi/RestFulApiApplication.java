package com.example.RestFulApi;

import com.example.RestFulApi.Patient_Registration.Patient_Registration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class RestFulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulApiApplication.class, args);
	}



}
