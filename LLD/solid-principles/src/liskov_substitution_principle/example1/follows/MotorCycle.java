package liskov_substitution_principle.example1.follows;

// Subclass of Bike - implements all Bike class behavior
public class MotorCycle extends Bike implements Engine {
    String company;
    boolean isEngineOn;
    int speed;

    public MotorCycle(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true; // turn on the engine!
        System.out.println("Engine is ON!");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false; // turn off the engine!
        System.out.println("Engine is OFF!");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }

    // Key Benefits of the Refactored Code
    // Prevents Fragile Code: LSP helps avoid situations where subclass behavior violates the expectations set by the parent class.
    // Improves Flexibility: By designing classes that can be substituted without breaking the parent contract.
    // Improved maintainability: Changes to subclasses don't break existing code.
    // Promotes Code Reusability: LSP facilitates the reuse of base classes and the creation of new subclasses without requiring modifications to existing code.

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }
}
