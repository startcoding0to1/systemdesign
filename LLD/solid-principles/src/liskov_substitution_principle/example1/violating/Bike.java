package liskov_substitution_principle.example1.violating;

// BAD: This design violates LSP
public interface Bike {
    void turnOnEngine();
    void turnOffEngine();
    void accelerate();
    void applyBrakes();
}
