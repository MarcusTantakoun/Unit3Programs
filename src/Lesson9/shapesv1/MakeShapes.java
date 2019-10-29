package Lesson9.shapesv1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class MakeShapes {

    public static void main(String[] args) {
        /*Circle c = new Circle(50,50,100);
        Shape c1 = new Circle(50,50,100);
        Rect r = new Rect(100,100,150,50);
        Shape r1 = new Rect(100,100,150,50);
        //we can collect both types under the common interface
        Shape shapes[] = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = i % 2==0? new Circle(10,10,10) : new Rect(10,10,10,10);
        }
        
        
        //polymorphism
        Shape silly = new Circle(0,0,0);
        silly = new Rect(50,100,200,100);
        
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        p.move(5);
        silly.draw(p);//box
        System.out.println(silly);
        
        
        silly = new Circle(0,0,100);
        silly.draw(p);//circle
        
        System.out.println(silly);
    } */
        
        Wheel w = new Wheel(10,10,50,6);
        System.out.println("Wheel is at " + w.getXPos() + ", " + w.getYPos());

        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if(i<8) shp[i] = getRandCircle();
            else if (i<8)shp[i] = getRandRect();
            else{
                shp[i] = getRandWheel();
                System.out.println(shp[i]);
            }
        }
        
        //draw all 10 shapes
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        for(Shape x : shp){
            x.draw(p);
        }
        //resize each shape
        Scanner s = new Scanner(System.in);
        
        for (Shape d : shp){
            System.out.println("Press any key to shrink a shape");
            s.nextLine();
            d.erase(p);
            d.stretchBy(0.5);
            d.draw(p);
        }
        
        
        for (Shape m : shp){
            System.out.println("Press any key to move a shape");
            s.nextLine();
            m.erase(p);
            m.move(m.getXPos() + 50, m.getYPos() + 50);
            m.draw(p);
        }
        System.out.println("Press any key to turn all circles green");
        for (Shape shape : shp) {
            if(shape instanceof Circle) //wheels also qualifies as circles. Wheel is-a circle
                ((Circle)shape).turnGreen(p);//this is what casting an object looks like
            if(shape instanceof Wheel)
                System.out.println(shape);
        }
        
        System.out.println("And wheels have had thir spokes set to 20");
        for (Shape shape : shp) {
            if(shape instanceof Wheel){
                shape.erase(p);
                ((Wheel)shape).setSpoke(20);
                shape.draw(p);
            }
        }
    }

    public static Circle getRandCircle() {
        //xpos and ypos -> -200 to 200 //rad = 50 to 100
        Circle temp = new Circle((Math.random() * 400 - 200),
                                (Math.random() * 400 - 200),
                                (Math.random() * 50 + 50));
                                return temp;
    }
    
    public static Circle getRandWheel() {
        //xpos and ypos -> -200 to 200 //rad = 50 to 100
        Wheel temp = new Wheel((Math.random() * 400 - 200),
                                (Math.random() * 400 - 200),
                                (Math.random() * 50 + 50),5);
                                return temp;
    }
    
    public static Rect getRandRect(){
        Rect temp = new Rect((Math.random() * 400 - 200),
                                (Math.random() * 100 + 50),
                                (Math.random() * 50 + 50),
                                (Math.random() * 50 + 50));
                                return temp;
        }
}
