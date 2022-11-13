package org.example.model;

import java.util.ArrayList;

public abstract class systemUserModel {
  private final String address;
  public systemUserModel(String address) {
    this.address = address;
  }
  public String getAddress() {
    return address;
  }
  public abstract ArrayList<String> getParams();
}