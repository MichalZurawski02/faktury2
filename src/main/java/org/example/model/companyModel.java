package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;

public class companyModel extends systemUserModel {
  private final String companyName;
  private final int nip;
  
  public companyModel(String companyName, int nip, String address) {
    super(address);
    this.companyName = companyName;
    this.nip = nip;
  }
  
  public int getNip() {
    return nip;
  }
  
  public String getCompanyName() {
    return companyName;
  }
  
  @Override
  public ArrayList<String> getParams() {
    return new ArrayList<>(Arrays.asList(companyName, Integer.toString(nip)));
  }
}
