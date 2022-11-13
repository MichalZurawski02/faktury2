package org.example.model;

public class itemModel {
  private double nettoPrice;
  
  private double vat;
  private String name;
  
  public itemModel(double nettoPrice, double vat, String name) {
    this.nettoPrice = nettoPrice;
    this.vat = vat;
    this.name = name;
  }
  
  public double getNettoPrice() {
    return nettoPrice;
  }
  
  public double getVat() {
    return vat;
  }
  
  public String getName() {
    return name;
  }
  
}
