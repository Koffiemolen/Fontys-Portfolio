package logic.entities;

import devices.KeyboardControl;

import javax.swing.*;
import java.awt.*;

public class Ship extends ControlledGameObject{

    private final ImageIcon shipImage = new ImageIcon("images/shipSkin.gif");
    private final ImageIcon bonusAlien = new ImageIcon("images/bonusEnemySkin.gif");
    private final ImageIcon lifeCounter = new ImageIcon("images/shipSkinSmall.gif");

    // Constructor for all ship objects
    public Ship(int xValue, int yValue, Color color, KeyboardControl control) {
        super(xValue, yValue, color, control);
    }

    // Bonus enemy ship
    public void bonusDraw(Graphics graphics){
        bonusAlien.paintIcon(null, graphics, this.getXCoordinateValue(), this.getYCoordinateValue());
    }

    // Draw ships for lice counter
    public void lifeCounter(Graphics graphics){
        lifeCounter.paintIcon(null, graphics, this.getXCoordinateValue(), this.getYCoordinateValue());
    }

    // Player controlled ship
    @Override
    public void draw(Graphics graphics) {
        shipImage.paintIcon(null, graphics, this.getXCoordinateValue(), this.getYCoordinateValue());
    }

    // Gets the hitbox for all the ship objectes
    @Override
    public Rectangle getBounds(){
        Rectangle shipHitRectangle = new Rectangle(this.getXCoordinateValue(), this.getYCoordinateValue(), 50, 50);
        return shipHitRectangle;
    }

    // move ship objects
    @Override
    public void move() {
        if(getControl().getKeyStatus(37)){
            this.setXCoordinateValue(this.getXCoordinateValue() - 10);
        }
        if(getControl().getKeyStatus(39)){
            this.setXCoordinateValue(this.getXCoordinateValue() + 10);
        }

        // Edge to edge without stopping
        if(this.getXCoordinateValue() > 750){
            this.setXCoordinateValue(-50);
        }
        if(this.getXCoordinateValue() < -50){
            this.setXCoordinateValue(750);
        }
    }
}
