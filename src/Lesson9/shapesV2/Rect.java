
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape{
    private double width, height;
    
    public Rect(double x, double y, double w, double h){
        super(x,y);
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }

    public void draw(Pen p) {
        p.up(); //lift pen up
        p.move(xPos,yPos); //move pen to coordinate
        p.down(); //put pen down
        p.setDirection(0); //make sure its facing right direction
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    public void stretchBy(double factor) {
        width = width * factor;
        height = height * factor;
    }
    
    public String toString(){
        String str = "Rectangle\n======\n";
        str += "\nWidth: " + width + "m Height: " + height + "m";
        str += super.toString();
        return str;
    }

    public double perimeter() {
        return width+width+height+height;
    }
}
