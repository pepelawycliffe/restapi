package com.example.RestFulApi.Patient_Registration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PatientConfig {

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository repository){
		return  args -> {
			Patient_Registration mariam =	new Patient_Registration(

					LocalDate.of(2000,01,02),
					"miriam",
					"jane",
					LocalDate.of(2000,01,02),
					"female"
			);
			Patient_Registration riam =	new Patient_Registration(

					LocalDate.of(2000,01,02),
					"riam",
					"jpene",
					LocalDate.of(2000,01,02),
					"female"
			);
			Patient_Registration alex =	new Patient_Registration(

					LocalDate.of(2000,01,02),
					"iam",
					"alex",
					LocalDate.of(2000,01,02),
					"male"
			);
			repository.saveAll(
					List.of(mariam,riam,alex)
			);

		};
	}

}
