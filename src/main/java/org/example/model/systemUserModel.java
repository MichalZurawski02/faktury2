package org.example.model;

//model - reprezentuje uzytkownika, nic wiecej
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