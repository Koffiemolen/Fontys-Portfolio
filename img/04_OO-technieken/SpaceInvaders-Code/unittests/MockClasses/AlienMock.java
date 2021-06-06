package MockClasses;

import logic.entities.MovingGameObject;
import javax.swing.*;
import java.awt.*;

public class AlienMock extends MovingGameObject {
    private final ImageIcon alien1 = new ImageIcon("images/alien-blue.gif");
    private final ImageIcon alien2 = new ImageIcon("images/alien-orange.gif");
    private final ImageIcon alien3 = new ImageIcon("images/alien-red.gif");
    private final ImageIcon alienBoss = new ImageIcon("images/alien-bos-green.gif");
    private final ImageIcon alienBoss2 = new ImageIcon("images/alien-bos-purple.gif");
    private final ImageIcon alienBoss3 = new ImageIcon("images/alien-bos-red.gif");

    private int alienType;
    private int alienWidth;
    private int alienHeight;
    private int alienHealth;

    public AlienMock(int xValue, int yValue, int velocityX, int velocityY, int alienType, Color color, int alienWidth, int alienHeight) {
        super(xValue, yValue, velocityX, velocityY, color);
        this.alienType = alienType;
        this.alienWidth = alienWidth;
        this.alienHeight = alienHeight;
        this.alienHealth = 1;
    }

    public AlienMock(int xValue, int yValue, int velocityX, int velocityY, int alienType, Color color, int alienWidth, int alienHeight, int alienHealth) {
        super(xValue, yValue, velocityX, velocityY, color);
        this.alienType = alienType;
        this.alienWidth = alienWidth;
        this.alienHeight = alienHeight;
        this.alienHealth = alienHealth;
    }

    public void draw(Graphics g) {
        // Varient 1
        if (this.alienType % 3 == 0) {
            alien1.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            // Varient 2
        } else if (this.alienType % 3 == 1 && this.alienType != 100) {
            alien2.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            // Varient 3
        } else if (this.alienType % 3 == 2) {
            alien3.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            // Boss Enemy
        } if (this.alienType == 100)
        {
            if(alienHealth > 20){
                alienBoss.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            }
            else if(alienHealth > 10){
                alienBoss2.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            }
            else if(alienHealth > 0){
                alienBoss3.paintIcon(null, g, this.getXCoordinateValue(), this.getYCoordinateValue());
            }
        }
    }

    @Override
    public Rectangle getBounds(){
        Rectangle alienHitRectangle = new Rectangle(this.getXCoordinateValue(), this.getYCoordinateValue(), alienWidth, alienHeight);
        return  alienHitRectangle;
    }

    @Override
    public void move(){
        this.setXCoordinateValue(this.getXCoordinateValue() + getVelocityX());
    }

    public int getAlienType() {
        return alienType;
    }

    public int getAlienWidth() {
        return alienWidth;
    }

    public int getAlienHeight() {
        return alienHeight;
    }

    public int getAlienHealth() {
        return alienHealth;
    }

    public void setAlienHealth(int alienHealth) {
        this.alienHealth = alienHealth;
    }
}

