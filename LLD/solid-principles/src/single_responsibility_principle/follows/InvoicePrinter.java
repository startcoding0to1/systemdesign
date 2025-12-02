package single_responsibility_principle.follows;

import utility.Invoice;

// Responsibility 3: Printing the Invoice only
public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        // Print the invoice
        System.out.println("Printing Invoice...");
    }
}

