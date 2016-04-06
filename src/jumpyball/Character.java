/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpyball;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author alextsai
 */
class Character {
    
    public Character(int x, int y, Image image){
        this.x = x;
        this.y = y;
        this.image = image;
               
    }
    
    public void draw(Graphics graphics){
        graphics.drawImage(image, x, y, null);
    }
    
//<editor-fold defaultstate="collapsed" desc="Proprties">
    private int x;
    private int y;
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
     * @return the image
     */
    public Image getImage() {
        return image;
    }
    
    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
//</editor-fold>
    
    
}
