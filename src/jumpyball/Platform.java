/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpyball;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author alextsai
 */
public class Platform {

    public void Platform(int x, int y, int width, int height) {
        this.setX(x);
        this.setY(y);
        this.setHeight(height);
        this.setWidth(width);

        this.image = ResourceTools.loadImageFromResource("jumpyball/platform.png");
    }

    public void Platform(int x, int y, int width, int height, Image image) {
        this.setX(x);
        this.setY(y);
        this.setHeight(height);
        this.setWidth(width);
        this.image = image;
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x, y, width, height;
    private Image image;
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
//</editor-fold>
}
