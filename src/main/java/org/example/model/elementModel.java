package org.example.model;

public class elementModel {
  private itemModel item;
  private int quantity;
  
  public elementModel(double nettoPrice, double vat, String name,  int quantity) {
    addItem(nettoPrice, vat, name);
    this.quantity = quantity;
  }
  
  public itemModel getItemModel() {
    return item;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void addItem(double nettoPrice, double vat, String name) {
    this.item = new itemModel(nettoPrice, vat, name);
  }
  
}
