package Lesson9.shapesV2;
import TurtleGraphics.Pen;

public class Wheel extends Circle{
    
    private double spokes;
    //wheel has four properties
    //it inherits x, y, radius from Circle
    
    public Wheel(double x, double y, double r, double s) {
        super(x, y, r); //called the Parent class constructor "super" means parent
        spokes = s;
    }
    
    //all methods from Circle are available to wheel by default
    
    //some methods (area, getXPos & getYPos, stretchBy, move) are fine as it is from Circle
    
    //others (ex: draw) are a good start, but need to be added on to (extended)
    //toString -> we will override completely 
    
    public void draw(Pen p){
        //call the Parents version of draw
        super.draw(p);
        
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * (360/spokes));
            p.move(radius);
        }
    }
    
    //exlcusive method only for Wheel
    public void setSpoke(int s){
        spokes = s;
    }
    
    //completely override the Parent
    public String toString(){
        String str = "Wheel\n======\n";
        str += "XPos: " + xPos + " YPos: " + yPos;
        str += "\nRadius: " + radius + "m";
        str += "\nSpokes: " + spokes;
        str += String.format("\nArea: %.2fm^2", area());
        str += String.format("\nPerimeter: %.2fm", perimeter());
        return str;
    }
    
}
