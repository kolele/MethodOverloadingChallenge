package com.kole;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(5);



    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >=0 || (inches >=0 || inches <=12)){
            double totalCentimeters = (feet * 30.48) + (inches * 2.54);
            return totalCentimeters;
        } else System.out.println("Feet or inches outside of boundaries");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0){
            double totalFeet = inches / 12;
            double overload = calcFeetAndInchesToCentimeters(totalFeet, inches);
            return overload;
        } return -1;

    }
}
