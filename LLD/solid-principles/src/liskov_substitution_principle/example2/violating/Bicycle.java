package liskov_substitution_principle.example2.violating;

public class Bicycle extends Vehicle {
    public Boolean hasEngine() {
        return null;
    }
}
