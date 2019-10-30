
package Lesson9.shapesV2;

public abstract class Employee {

    protected String name;
    protected double rate;
    protected int hours;

    public Employee(){
        name="";
        rate=0;
        hours=0;
    }
    
    public boolean setName(String nm){
        boolean nameBlank = nm.equals("");
        if(nameBlank) return false;
        else{
            name = nm;
            return true;
        }
    }
    
    public boolean setRate(double rt){
        boolean rateOk = rt >= 6.75 && rt <=30.50;
        if(rateOk){
            rate = rt;
            return true;
        }
        else return false;
    }
    
    public boolean setHours(int h){
        boolean hoursOk = h >=1 && h <=60;
        if(hoursOk)
            hours = h;
        return hoursOk;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPay(){
        double pay;
        pay = hours*rate;
        return pay;
    }
    
  
}
