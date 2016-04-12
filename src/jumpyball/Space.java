/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Needs:
 -Movement from left to right
 - Can move you character
 -continiusly jumping up
 -You don't need to hit any bottons to jump it will do it continiusly
 -able to puase, and return
 - pause menu
 -Scoring/hieght counting methods
 - you gain points for each platform you jump up
 -gravity
 - after a certain amount of time you character will start falling and it will
 fall faster the longer it has been falling
 -start menu
 -chose you character
 -counter for the height that you have gone through
 -when you hit a certain height it will change the background to the next level
 */
package jumpyball;

import environment.Environment;
import environment.Velocity;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author alextsai
 */
class Space extends Environment {

    private Character ball;

    public Space() {
        ball = new Character(450, 300, new Velocity(0, 0), ResourceTools.loadImageFromResource("jumpyball/character1.jpg"));
    }

    @Override
    public void initializeEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("jumpyball/stage_1_city.jpg"));
    }

    @Override
    public void timerTaskHandler() {
        if (ball != null) {
            ball.move();
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if ((e.getKeyCode() == KeyEvent.VK_LEFT) || (e.getKeyCode() == KeyEvent.VK_A)){
            ball.addXVelocity(1);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ball.addXVelocity(-1);
        } 

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (ball != null) {
            ball.draw(graphics);
        }
    }

}
