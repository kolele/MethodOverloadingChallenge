package com.kole;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(221));

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet < 0 || inches <0 || inches > 12){
            System.out.println("Invalid feet or inches");
            return -1;
        } else {
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches < 0){
            System.out.println("Invalid inches");
            return -1;
        } else {
            double totalFeet = inches / 12;
            double remainingInches = inches % 12;
            System.out.println(remainingInches);
            return calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
        }

    }

}
