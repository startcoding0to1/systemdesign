package utility;

// BAD: This class violates SRP by having multiple responsibilities
public class Invoice {

    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculate the total (Business Logic)
    public void calculateTotal() {
        System.out.println("Calculating total...");
        this.total = this.marker.price * this.quantity;
    }

    // Responsibility 2: Database Operations
    public void saveToDB() {
        System.out.println("Saving to DB...");
    }

    // Responsibility 3: Print the Invoice
    public void printInvoice() {
        System.out.println("Printing Invoice...");
    }
}



