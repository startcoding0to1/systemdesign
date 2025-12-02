package liskov_substitution_principle.example2.follows;

public class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
