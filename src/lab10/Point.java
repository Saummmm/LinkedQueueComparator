/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author saum
 */
//Point class
public class Point {
    //fields
    private int x;
    private int y;
    
    //constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
    
    //setters and getters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //turns the fields into a string coordinate
    @Override
    public String toString() {
        return ("(" + String.valueOf(x) + "," + String.valueOf(y) + ")");
    }

}
