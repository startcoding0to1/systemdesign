package open_close_principle.follows;


import utility.Invoice;
import utility.Marker;

// Usage demonstrating OCP compliance
public class Demo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10,
                2020), 10);
        invoice.calculateTotal();

        InvoiceDao databaseInvoiceDao = new
                DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save(); // Save to DB

        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save(); // Save to File

        // The system is:
        // - OPEN for extension (new save functions can be added like mongodb)
        // - CLOSED for modification (existing code remains unchanged)
    }
}

