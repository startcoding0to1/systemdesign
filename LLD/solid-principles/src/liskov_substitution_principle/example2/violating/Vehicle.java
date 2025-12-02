package liskov_substitution_principle.example2.violating;

public class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}
