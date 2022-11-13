package org.example.model;

public class personModel extends systemUserModel {
  private final String firstName;
  private final String lastName;
  
  public personModel(String firstName, String lastName, String address) {
    super(address);
    this.firstName = firstName;
    this.lastName = lastName;
  }
  @Override
  public String toString() {
    return firstName + "\n" + lastName + "\n" + super.toString();
  }
}
