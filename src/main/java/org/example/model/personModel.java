package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;

public class personModel extends systemUserModel {
  private final String firstName;
  private final String lastName;
  
  public personModel(String firstName, String lastName, String address) {
    super(address);
    this.firstName = firstName;
    this.lastName = lastName;
  }
  @Override
  public ArrayList<String> getParams() {
    return new ArrayList<>(Arrays.asList(firstName, lastName));
  }
}
