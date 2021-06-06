package logic.entities;

import java.awt.*;

public class AlienBomb extends MovingGameObject{

    // Aliens dropping bombs
    // Constructor for the alien bombs


    public AlienBomb(int xValue, int yValue, int bombDiameter, Color color) {
        super(xValue, yValue, 0, 0, color);
    }

    // Draw the alien bomb
    @Override
    public void draw(Graphics graphics){
        graphics.setColor(this.getColor());
        graphics.fillRect(this.getXCoordinateValue(), this.getYCoordinateValue(), 7, 15);
    }

    // Get hitbox for the alien bomb
    @Override
    public Rectangle getBounds(){
        Rectangle alienBombHitRectangle = new Rectangle(getXCoordinateValue(), getYCoordinateValue(), 7, 15);
        return alienBombHitRectangle;
    }
}
