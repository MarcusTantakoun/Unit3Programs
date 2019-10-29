
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.util.Scanner;

public class MakeShape {

    public static void main(String[] args) {
        /*Pen p = new StandardPen();
        Shape c = new Circle(0,0,25);
        Shape r = new Rect(0,0,50,25);
        Shape w = new Wheel(-75,0,25,3);
        c.draw(p);
        r.draw(p);
        w.draw(p);*/
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        
        Shape s; // can become a rect, circle, or wheel
        Circle c; // can become a circle or a wheel
        Wheel w; // can only become a wheel
        
        //s = new Shape(10,10); NOT ALLOWED
        //polymorphism:
        s = new Rect(10,10,10,10);
        s = new Wheel(10,10,10,10);
        s = new Circle(10,10,10);
        
        c = new Circle(10,10,10);
        c = new Wheel(10,10,10,10);
        
        w = new Wheel(10,10,10,10); // we can work down heirarchy but not back up
        //w can only be wheel it cant be new circle
        
        Shape actual = new Rect(0,0,200,100);
        actual.draw(p);
        Scanner scan = new Scanner(System.in);
     
        System.out.print("Press any key to make it a circle");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual, 'c');
        actual.draw(p);
        System.out.println(actual);
        
        System.out.print("Press any key to make it a wheel");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual, 'w');
        actual.draw(p);
        System.out.println(actual);
    }
    
    public static Shape makeShapeFromAnother(Shape s, char type){
        double x = s.getXPos();
        double y = s.getYPos();
        double area = s.area();
        
        if(type=='r'){
            double width = Math.sqrt(area);
            double height = Math.sqrt(area);
            return new Rect(x, y, width, height);
        }
        else if(type=='c'){
            double radius = Math.sqrt(area/Math.PI);
            return new Circle(x, y, radius);
        }
        else{
            double radius = Math.sqrt(area/Math.PI);
            return new Wheel(x, y, radius, 6);
            //return wheel by default
        }
    }
    
}
