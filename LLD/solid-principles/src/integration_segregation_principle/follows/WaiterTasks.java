package integration_segregation_principle.follows;

// GOOD: This follows ISP - Multiple focused interfaces following ISP
public interface WaiterTasks {
    void serveFoodAndDrinks();
    void takeOrder();
}
