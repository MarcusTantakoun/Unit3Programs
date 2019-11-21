package Lesson8.Assignments.craps;
import java.awt.Color;
import java.awt.Graphics;

public class Craps {
    private Dice dice1, dice2;
    private int rollnum, point;
    private boolean newGame;
    
    Craps(Graphics g1, Graphics g2, int size1, int size2){
        dice1 = new Dice(g1, size1);
        dice2 = new Dice(g2, size2);
        
        dice1.setColor(Color.red,Color.white);
        dice2.setColor(Color.red,Color.white);
        rollnum = 0;
        point = 0;
        newGame = true;
    }
    
    public void roll(){
        newGame = false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if(rollnum==1) {
            point = getTotal();
        }
        dice1.draw();
        dice2.draw();
    }
    
    public boolean hasWon(){
        boolean win = false;
        if(rollnum==1){
            if(getTotal()==7 || getTotal()==11) win = true;       
        }
        else if(rollnum>1){
            if(getTotal()== point) win = true;
        }
        return win;
    }
    
    public boolean hasLost(){
        boolean lose = false;
        if(rollnum==1){
            if(getTotal()==2 || getTotal()==3 || getTotal()==12) lose = true;
        }
        else if(rollnum>1){
            if(getTotal()==7) lose = true;
        }
        return lose;
    }
    
    public boolean isNewGame(){
        return newGame;
    }
    
    public int getTotal(){
        return dice1.getValue() + dice2.getValue();
    }
    
    public int getPoint(){
        return point;
    }
}
