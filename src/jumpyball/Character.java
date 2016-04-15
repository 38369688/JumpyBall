/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpyball;

import environment.Velocity;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author alextsai
 */
class Character {
    
    public Character(int x, int y, Velocity velocity, Image image){
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.image = image;
        
    }
    
    public void draw(Graphics graphics){
       graphics.drawImage(image, x, y, null);
    }
    
    public void move (){
        x += velocity.x;
        y += velocity.y;
    }
    
//<editor-fold defaultstate="collapsed" desc="Proprties">
    private int maxVelocity = 7;
    
    private Velocity velocity;
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
    
    
//    /**
//     * @return the velocity
//     */
//    public Velocity getVelocity() {
//        return velocity;
//    }

    /**
     * @param velocity the velocity to set
     */
    public void addXVelocity(int xVelocity) {
        this.velocity.x += xVelocity;
        if (this.velocity.x > maxVelocity) {
            this.velocity.x = maxVelocity;
        } else if (this.velocity.x < -maxVelocity){
            this.velocity.x = -maxVelocity;
        }
    }
    
//</editor-fold>

    
}
