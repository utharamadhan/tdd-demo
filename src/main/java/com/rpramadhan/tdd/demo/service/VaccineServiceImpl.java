package com.rpramadhan.tdd.demo.service;

import com.rpramadhan.tdd.demo.model.Patient;
import org.joda.time.DateTime;
import org.joda.time.Years;
import org.springframework.stereotype.Service;

@Service
public class VaccineServiceImpl {

  public Boolean assessPatientEligibility(Patient patient) {
    //calculate the age
    Integer age = calculateAgeOfPatient(patient.getVaccineDate(), patient.getDateOfBirth());

    //check to the age table criteria
    Boolean isEligible = Boolean.FALSE;
    if (age >= 15 && age <= 60) {
      isEligible = Boolean.TRUE;
    }

    return isEligible;
  }

  public Integer calculateAgeOfPatient(DateTime vaccineDate, DateTime dateOfBirth) {
    return Math.abs(Years.yearsBetween(vaccineDate, dateOfBirth).getYears());
  }
}
