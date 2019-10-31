package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;

//abstract = can't make direct instance of shape
public abstract class Shape {
    protected double xPos, yPos;
    
    public Shape(double x, double y){
        xPos = x;
        yPos = y;
    }
    
    public Shape(){
        xPos=0;
        yPos=0;
    }
    //like interface, child class MUST implement it
    abstract double area();
    abstract void draw(Pen p);
    abstract void stretchBy(double factor);
    abstract double perimeter();
    
    //final methods can never be overwritten by child classes
    final public double getXPos() {
        return xPos;
    }

    final public double getYPos() {
        return  yPos;
    }

    public void move(final double xLoc, final double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    public String toString(){
        String str = "\nXPos: " + xPos + " YPos: " + yPos;
        str += String.format("\nArea: %.2fm^2\n", area());
        return str;
    }
}
