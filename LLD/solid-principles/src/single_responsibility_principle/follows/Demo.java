package single_responsibility_principle.follows;

import utility.Invoice;
import utility.Marker;

// Usage example showing how all classes work together
public class Demo {
    public static void main(String[] args) {

        // Create the service objects
        Invoice invoice = new Invoice(
                new Marker("name", "color", 10, 2020),
                10
        );

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        // Use the services
        invoice.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.print();
    }
}

