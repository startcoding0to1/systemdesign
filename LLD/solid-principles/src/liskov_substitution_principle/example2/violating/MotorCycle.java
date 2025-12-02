package liskov_substitution_principle.example2.violating;

public class MotorCycle extends Vehicle {

    public String getSpecifications() {
        return "MotorCycle has " + this.getNumberOfWheels() + " wheels and has engine: " + this.hasEngine();
    }
}
