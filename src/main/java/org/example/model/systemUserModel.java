package org.example.model;

public abstract class systemUserModel {
  private final String address;
  public systemUserModel(String address) {
    this.address = address;
  }
  
  @Override
  public String toString() {
    return address;
  }
}