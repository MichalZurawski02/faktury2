package org.example.model;

import java.util.ArrayList;

public class invoiceModel {
  private final int number;
  private final String date;
  private final ArrayList<elementModel> elementList;
  private companyModel issuer;
  private systemUserModel buyer;
  
  public invoiceModel(int number, String date) {
    elementList = new ArrayList<>();
    this.number = number;
    this.date = date;
  }
  
  public int getNumber() {
    return number;
  }
  
  public String getDate() {
    return date;
  }
  
  public ArrayList<elementModel> getElementList() {
    return elementList;
  }
  
  
  public companyModel getIssuer() {
    return issuer;
  }
  
  public systemUserModel getBuyer() {
    return buyer;
  }
  
  public void addBuyer(String firstName, String lastName, String address) {
    this.buyer = new personModel(firstName, lastName, address);
  }
  
  public void addBuyer(String companyName, int nip, String address) {
    this.buyer = new companyModel(companyName, nip, address);
  }
  
  public void addIssuer(String companyName, int nip, String address) {
    this.issuer = new companyModel(companyName, nip, address);
  }
  
  public void addElement(double nettoPrice, double vat, String name, int quantity) {
    elementModel element = elementList.stream()
            .filter(elementModel -> name.equals(elementModel.getItemModel().getName()))
            .findAny()
            .orElse(null);
    if(element == null) {
      elementList.add(new elementModel(nettoPrice, vat, name, quantity));
    }
    else {
      element.setQuantity(element.getQuantity() + quantity);
    }
  }
}
