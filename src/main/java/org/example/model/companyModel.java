package org.example.model;

//model - reprezentuje specyficznego uzytkownika
public class companyModel extends systemUserModel {
  private final String companyName;
  private final int nip;
  
  public companyModel(String companyName, int nip, String address) {
    super(address);
    this.companyName = companyName;
    this.nip = nip;
  }
  @Override
  public String toString() {
    return companyName + "\n" + nip + "\n" + super.toString();
  }
}
