
package Lesson9.shapesV2;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(){
        super();
    }
    
    public double getPay(){
        double pay;
        pay = hours*rate;
        return pay;
    }
}
