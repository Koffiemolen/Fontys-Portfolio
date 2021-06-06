package logic.entities;

// A drawable object that can be moved
// Child of GameObject
// Implements Moveable so it is forced to have a move method

import devices.KeyboardControl;
import logic.interfaces.Moveable;

import java.awt.*;

public abstract class ControlledGameObject extends GameObject implements Moveable {

    private KeyboardControl control;

    // The constructor for any moveable and controllable object needs to have an x and y value, a color and a control

    public ControlledGameObject(int xValue, int yValue, Color color, KeyboardControl control) {
        super(xValue, yValue, color);
        this.control = control;
    }

    public KeyboardControl getControl() {
        return control;
    }

    public void setControl(KeyboardControl control) {
        this.control = control;
    }
}
