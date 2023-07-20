package com.example.RestFulApi.Patient_Registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table
public class Patient_Registration {
@Id
@SequenceGenerator(
		name = "patient_sequence",
		sequenceName = "patient_sequence",
		allocationSize = 1
)
@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "patient_sequence"
)
	private long Patient_Id;
	private LocalDate Registration_Date;
	private String FirstName;
	private String LastName;
	private LocalDate DOB;
	private  String Gender;

	public Patient_Registration(long patient_Id) {
		Patient_Id = patient_Id;
	}

	public Patient_Registration(long patient_Id, LocalDate registration_Date, String firstName, String lastName,
			LocalDate DOB,
			String gender) {
		Patient_Id = patient_Id;
		Registration_Date = registration_Date;
		FirstName = firstName;
		LastName = lastName;
		this.DOB = DOB;
		Gender = gender;
	}

	public Patient_Registration(LocalDate registration_Date,
			String firstName,
			String lastName,
			LocalDate DOB,
			String gender) {
		Registration_Date = registration_Date;
		FirstName = firstName;
		LastName = lastName;
		this.DOB = DOB;
		Gender = gender;
	}

	public long getPatient_Id() {
		return Patient_Id;
	}

	public LocalDate getRegistration_Date() {
		return Registration_Date;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public String getGender() {
		return Gender;
	}

	public void setPatient_Id(long patient_Id) {
		Patient_Id = patient_Id;
	}

	public void setRegistration_Date(LocalDate registration_Date) {
		Registration_Date = registration_Date;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Patient_Registration{" +
				"Patient_Id=" + Patient_Id +
				", Registration_Date=" + Registration_Date +
				", FirstName='" + FirstName + '\'' +
				", LastName='" + LastName + '\'' +
				", DOB=" + DOB +
				", Gender='" + Gender + '\'' +
				'}';
	}
}
