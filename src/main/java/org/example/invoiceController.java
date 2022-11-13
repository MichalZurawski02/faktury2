package org.example;

import java.util.ArrayList;

import org.example.model.companyModel;
import org.example.model.elementModel;
import org.example.model.systemUserModel;

// kontroler - jest posrednikiem w komunikacji widoku z logika i danymi,
// wywoluje tylko odpowiednie metody tak, zeby odpowiednie warstwy byly wyabstrahowane
// jej jedynym zadaniem jest bycie lacznikiem
public class invoiceController {
  private final view view;
  private final invoiceService invoiceService;
  
  public invoiceController() {
    view = new view(this);
    invoiceService = new invoiceService(null); //add repository which saves invoice
  }
  
  public void createInvoice(int number, String date) {
    invoiceService.createInvoice(number, date);
  }
  
  public void addBuyer(String name, int nip, String address) {
    invoiceService.addBuyerAsCompany(name, nip, address);
  }
  
  public void addBuyer(String firstName, String secondName, String address) {
    invoiceService.addBuyerAsPerson(firstName, secondName, address);
  }
  
  public void addIssuer(String companyName, int nip, String address) {
    invoiceService.addIssuer(companyName, nip, address);
  }
  
  public void addElement(double nettoPrice, double vat, String name, int quantity) {
    invoiceService.addElement(nettoPrice, vat, name, quantity);
  }
  
  public systemUserModel getBuyer() {
    return invoiceService.getBuyer();
  }
  
  public companyModel getIssuer() {
    return invoiceService.getIssuer();
  }
  
  public ArrayList<elementModel> getAllElements() {
    return invoiceService.getAll();
  }
  
  public String getDate() {
    return invoiceService.getDate();
  }
  
  public int getNumber() {
    return invoiceService.getNumber();
  }
  
  public String getElementAsString(int i) {
    return invoiceService.getElement(i).toString() + " | "
            + invoiceService.calculateTotalNettoPrice() + " | "
            + invoiceService.calculateTotalVat() + " | "
            + invoiceService.calculateTotalPrice();
  }
  
  public void save() {
    invoiceService.saveInvoice();
  }
  
  public void startProgram() {
    view.start();
  }
  
}
