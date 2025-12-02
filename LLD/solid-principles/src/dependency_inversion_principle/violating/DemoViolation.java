package dependency_inversion_principle.violating;

import dependency_inversion_principle.common.BluetoothKeyboard;
import dependency_inversion_principle.common.BluetoothMouse;
import dependency_inversion_principle.common.WiredKeyboard;
import dependency_inversion_principle.common.WiredMouse;

public class DemoViolation {
    public static void main(String[] args) {

        // create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");

        BluetoothKeyboard bluetoothKeyboard =
                new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse =
                new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // create macbook
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        // create macbook with bluetooth keyboard and mouse
        // MacBook macBookWithBluetoothParts = new MacBook(bluetoothKeyboard, bluetoothKeyboard);
        // cannot create macbook with bluetooth keyboard and mouse because
        // macbook depends on wired keyboard and mouse - tight coupling - violation of DIP
    }
}
