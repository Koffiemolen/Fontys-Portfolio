package devices;

import java.awt.event.KeyEvent;

public interface ControlProvider {
    boolean getKeyStatus(int keyCode);
    void resetController();
    void keyTyped(KeyEvent keyEvent);
    void keyPressed(KeyEvent keyEvent);
    void keyReleased(KeyEvent keyEvent);

}
