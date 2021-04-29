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
  private VaccineService vaccineService;

  @BeforeMethod(alwaysRun = true)
  public void doSetup(){
    MockitoAnnotations.initMocks(this);
  }

}
