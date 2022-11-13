package org.example.model;

import org.example.invoiceService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class invoiceServiceTest {
  private final static invoiceService invoice = new invoiceService(null);
  @BeforeAll
  static void init() {
    invoice.createInvoice(1, "01.01.2022");
    invoice.addElement(12, 0.23, "gazeta", 2);
    invoice.addElement(12, 0.23, "gazeta", 2);
    invoice.addElement(1, 0.08, "maliny", 1);
  }
  
  @Test
  void calculateTotalNettoPrice() {
    assertEquals(2, invoice.getAll().size());
    assertEquals(12*2 + 12*2 + 1, invoice.calculateTotalNettoPrice());
  }
  
  @Test
  void calculateTotalVat() {
    assertEquals(12 * 0.23 * 2 + 12 * 0.23 * 2 + 1 * 0.08 * 1, invoice.calculateTotalVat());
  }

  @Test
  void calculateTotalPrice() {
    assertEquals((12*2 + 12*2 + 1) + (12 * 0.23 * 2 + 12 * 0.23 * 2 + 1 * 0.08 * 1), invoice.calculateTotalPrice());
  }
}