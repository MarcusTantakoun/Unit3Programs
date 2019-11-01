
package Lesson9.Employee;

import Lesson9.shapesV2.*;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(){
        super();
    }
    
    public double getPay(){
        //over 40 hours
        double pay;
        if(hours <= 40){
            pay = rate * hours;
        }
        else{
            pay = 40 * hours + (hours-40) * rate * 2;
        }
        totalpay += pay;
        return pay;
    }
}
