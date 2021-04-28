package com.rpramadhan.tdd.demo.service;

import com.rpramadhan.tdd.demo.model.Patient;
import com.rpramadhan.tdd.demo.model.enums.Gender;
import org.joda.time.DateTime;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestVaccineServiceImpl {

  @InjectMocks
  private VaccineServiceImpl vaccineService;

  @BeforeMethod(alwaysRun = true)
  public void doSetup(){
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testAssessPatientEligible_whenPatient14_male() {
    //measure
    Patient patient = Patient.builder()
        .name("hengky")
        .vaccineDate(new DateTime(2021, 12, 12, 0, 0))
        .dateOfBirth(new DateTime(2006, 12, 13, 0, 0))
        .gender(Gender.MALE)
        .build();

    //act
    Boolean isEligible =
        vaccineService.assessPatientEligibility(patient);

    //assert
    Assert.assertFalse(isEligible);
  }

  @Test
  public void testAssessPatientEligible_whenPatient15_male() {
    //measure
    Patient patient = Patient.builder()
        .name("roy")
        .vaccineDate(new DateTime(2021, 12, 13, 0, 0))
        .dateOfBirth(new DateTime(2006, 12, 13, 0, 0))
        .gender(Gender.MALE)
        .build();

    //act
    Boolean isEligible =
        vaccineService.assessPatientEligibility(patient);

    //assert
    Assert.assertTrue(isEligible);
  }

  @Test
  public void testAssessPatientEligible_whenPatient61_male() {
    //measure
    Patient patient = Patient.builder()
        .name("firman")
        .vaccineDate(new DateTime(2021, 12, 12, 0, 0))
        .dateOfBirth(new DateTime(1960, 12, 12, 0, 0))
        .gender(Gender.MALE)
        .build();

    //act
    Boolean isEligible =
        vaccineService.assessPatientEligibility(patient);

    //assert
    Assert.assertFalse(isEligible);
  }

}
