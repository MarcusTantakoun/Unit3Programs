
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Circle extends Shape{

    protected double radius; //protected = only for parent and child classes
    
    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = (2 * Math.PI * radius) / 120;
        p.up();
        p.move(xPos,yPos);
        p.setDirection(0);
        p.move(radius);
        p.turn(90);
        p.down();
        
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

    @Override
    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    
    public String toString(){
        String str = "Circle\n======\n";
        str += "\nRadius: " + radius + "m";
        str += super.toString();
        return str;
    }
    
    public void turnGreen(Pen p){
        erase(p);
        p.setColor(Color.green);
        draw(p);
    }

    @Override
    public double perimeter() {
        return Math.PI*2*radius;
    }
    
}
