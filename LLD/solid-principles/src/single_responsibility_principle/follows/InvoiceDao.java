package single_responsibility_principle.follows;

import utility.Invoice;

// Responsibility 2: Managing Database Operations only
public class InvoiceDao {

    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save the invoice into DB
        System.out.println("Saving to DB...");
    }
}

