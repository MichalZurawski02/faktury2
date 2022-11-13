package org.example;
import org.example.model.companyModel;
import org.example.model.elementModel;
import org.example.model.invoiceModel;
import org.example.model.systemUserModel;

import java.util.ArrayList;

public class invoiceController {
  private invoiceModel invoice;
  private final view view;
  
  public invoiceController() {
    view = new view(this);
  }
  
  public void createInvoice(int number, String date) {
    invoice = new invoiceModel(number, date);
  }
  
  public void addBuyer(String name, int nip, String address) {
    invoice.addBuyer(name, nip, address);
  }
  public void addBuyer(String firstName, String secondName, String address) {
    invoice.addBuyer(firstName, secondName, address);
  }
  
  public void addIssuer(String companyName, int nip, String address) {
    invoice.addIssuer(companyName, nip, address);
  }
  
  public void addElement(double nettoPrice, double vat, String name, int quantity) {
    invoice.addElement(nettoPrice, vat, name, quantity);
  }
  
  public systemUserModel getBuyer() {
    return invoice.getBuyer();
  }
  
  public companyModel getIssuer() {
    return invoice.getIssuer();
  }
  
  public ArrayList<elementModel> getElementList() {
    return invoice.getElementList();
  }
  
  public String getDate() {
    return invoice.getDate();
  }
  
  public int getNumber() {
    return invoice.getNumber();
  }
  
  public void startProgram() {
    view.start();
  }
}
