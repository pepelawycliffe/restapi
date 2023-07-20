package com.example.RestFulApi.Patient_Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/PatientRegistration")
public class PatientRegistrationController {
	private  final PatientRegistrationService patientRegistrationService;

	@Autowired
	public PatientRegistrationController(PatientRegistrationService patientRegistrationService) {
		this.patientRegistrationService = patientRegistrationService;

	}

	@GetMapping
	public List<Patient_Registration> getPatientRegistration(){
	return patientRegistrationService.getPatientRegistration();
	}



}
