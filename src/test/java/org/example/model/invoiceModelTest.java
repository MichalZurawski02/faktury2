package org.example.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class invoiceModelTest {
  private final static invoiceModel invoice = new invoiceModel(1, "01.01.01");
  @BeforeAll
  static void init() {
    invoice.addElement(12, 0.23, "gazeta", 2);
    invoice.addElement(12, 0.23, "gazeta", 2);
    invoice.addElement(1, 0.08, "maliny", 1);
  }
  
  @Test
  void calculateTotalPrice() {
    assertEquals(2, invoice.getElementList().size());
    assertEquals(12*2 + 12*2 + 1, invoice.calculateTotalPrice());
  }
  
  @Test
  void calculateTotalVat() {
    assertEquals(2, invoice.getElementList().size());
    assertEquals(12 * 0.23 * 2 + 12 * 0.23 * 2 + 1 * 0.08 * 1, invoice.calculateTotalVat());
  }
}