package org.ictkerala.student;

class Invoice {
	
	String itemName;
    int quantity;
    double price;

    Invoice(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public void generateInvoice() {
        System.out.println("===== INVOICE =====");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : ₹" + price);
        System.out.println("-------------------");
        System.out.println("Total Amount : ₹" + calculateTotal());
        System.out.println("===================");
    }
}

public class InvoiceModuleTest {

    public static void main(String[] args) {

        // Test Case: Generate Invoice
        Invoice invoice = new Invoice("Burger", 3, 120);

        invoice.generateInvoice();

        // Verification
        if (invoice.calculateTotal() == 360) {
            System.out.println("\nInvoice Test Passed");
        } else {
            System.out.println("\nInvoice Test Failed");
        }
    }

}
