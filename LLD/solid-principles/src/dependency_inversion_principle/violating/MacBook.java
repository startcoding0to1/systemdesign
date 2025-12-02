package dependency_inversion_principle.violating;

import dependency_inversion_principle.common.Keyboard;
import dependency_inversion_principle.common.Mouse;
import dependency_inversion_principle.common.WiredKeyboard;
import dependency_inversion_principle.common.WiredMouse;

// VIOLATION OF DIP
// High-level module directly depending on low-level module
public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    // Direct dependency on concrete class
    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        keyboard = wiredKeyboard;  // Tight coupling
        mouse = wiredMouse;        // Tight coupling
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
