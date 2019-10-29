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
    //like interface, child class MUST implement it
    abstract double area();
    abstract void draw(Pen p);
    abstract void stretchBy(double factor);

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return  yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    public String toString(){
        String str = "XPos: " + xPos + " YPos: " + yPos;
        str += String.format("\nArea: %.2f\n", area());
        return str;
    }
}
