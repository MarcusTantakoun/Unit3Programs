package Lesson9.Employee;

import Lesson9.shapesV2.*;

public abstract class Employee {

    protected String name;
    protected double rate;
    protected int hours;
    protected static double totalpay;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
        totalpay = 0;
    }

    public static String getNameRules() {
        return "non-blank";
    }

    public static String getRateRules() {
        return "between 6.75 and 30.50, inclusive";
    }

    public static String getHourRules() {
        return "between 1 and 60, inclusive";
    }

    public final boolean setName(String nm) {
        boolean nameBlank = nm.equals("");
        if (nameBlank) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    public final boolean setRate(double rt) {
        boolean rateOk = rt >= 6.75 && rt <= 30.50;
        if (rateOk) {
            rate = rt;
            return true;
        } else {
            return false;
        }
    }

    public final boolean setHours(int h) {
        boolean hoursOk = h >= 1 && h <= 60;
        if (hoursOk) {
            hours = h;
        }
        return hoursOk;
    }

    public final String getName() {
        return name;
    }

    abstract double getPay();
    
    public static double getTotalPay(){
        return totalpay;
    }

}
