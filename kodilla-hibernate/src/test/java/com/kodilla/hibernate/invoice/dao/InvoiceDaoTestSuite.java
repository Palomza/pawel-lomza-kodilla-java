package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSaave() {
        //Given
        Product wine = new Product("Wine");
        Product cheese = new Product("Cheese");
        Product corkscrew = new Product("Corkscrew");

        Invoice invoice = new Invoice("1701");

        Item item1 = new Item(wine, new BigDecimal(24.99), 3);
        Item item2 = new Item(cheese, new BigDecimal(4.79), 5);
        Item item3 = new Item(corkscrew, new BigDecimal(12.99), 1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        productDao.deleteAll();
        invoiceDao.deleteById(id);
    }
}
