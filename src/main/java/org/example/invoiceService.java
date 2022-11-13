package org.example;

import org.example.model.companyModel;
import org.example.model.elementModel;
import org.example.model.invoiceModel;
import org.example.model.systemUserModel;

import java.util.ArrayList;

public class invoiceService {
  private invoiceRepository invoiceRepository;
  private invoiceModel invoice;
  
  public double calculateTotalPrice() {
    return calculateTotalNettoPrice() + calculateTotalVat();
  }
  
  public double calculateTotalVat() {
    return invoice.getElementList().stream().mapToDouble(elementModel -> elementModel.getItemModel().getNettoPrice()
            * elementModel.getItemModel().getVat()
            * elementModel.getQuantity()).sum();
  }
  
  public double calculateTotalNettoPrice() {
    return invoice.getElementList().stream().mapToDouble(elementModel -> elementModel.getItemModel().getNettoPrice()
            * elementModel.getQuantity()).sum();
  }
  
  public void createInvoice(int number, String date) {
    invoice = new invoiceModel(number, date);
  }
  
  public void addBuyerAsCompany(String name, int nip, String address) {
    invoice.addBuyer(name, nip, address);
  }
  
  public void addBuyerAsPerson(String firstName, String secondName, String address) {
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
  
  public String getDate() {
    return invoice.getDate();
  }
  
  public int getNumber() {
    return invoice.getNumber();
  }
  
  public void saveInvoice() {
    invoiceRepository.save(invoice);
  }
  
  public ArrayList<elementModel> getAll() {
    return invoice.getElementList();
  }
  
  public elementModel getElement(int i) {
    return invoice.getElementList().get(i);
  }
}
