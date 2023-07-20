package com.example.RestFulApi.Patient_Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientRegistrationService {



	private  final  PatientRepository patientRepository;
@Autowired
	public PatientRegistrationService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	public List<Patient_Registration> getPatientRegistration(){
		return patientRepository.findAll();
	}


}
