
package Lesson9.Employee;

import Lesson9.shapesV2.*;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(){
        super();
    }
    
    public double getPay(){
        double pay;
        pay = (hours-40)*(rate*2) + rate *40;
        return pay;
    }
}
