package com.rpramadhan.tdd.demo.model;

import com.rpramadhan.tdd.demo.model.enums.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class Patient {
  private String name;
  private DateTime vaccineDate;
  private DateTime dateOfBirth;
  private Gender gender;
}
