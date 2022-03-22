package com.company;

public class IfElse {
    public static void main(String[] args){
        int x = 11, y = 889;
        int addition = x + y;
        int subtraction = y - x;
        double z = 33.24;
        double comma = y + z, multiplikation = z * y;

        if (addition > 900){
            System.out.println("Deine Zahl ist größer als 900 (" + addition + ")");
        } else if (addition < 900){
            System.out.println("Deine Zahl ist kleiner 900. (" + addition + ")");
        } else {
            System.out.println("Deine Zahl ist gleich 900.(" + addition + ")");
        }
        if (subtraction > 900){
            System.out.println("Deine Zahl ist größer als 900.(" + subtraction + ")");
        } else if (subtraction < 900){
            System.out.println("Deine Zahl ist kleiner 900.(" + subtraction + ")");
        } else {
            System.out.println("Deine Zahl ist gleich 900.(" + subtraction + ")");
        }
        if (comma > 900){
            System.out.println("Deine Zahl ist größer als 900.(" + comma + ")");
        } else if (comma < 900){
            System.out.println("Deine Zahl ist kleiner 900.(" + comma + ")");
        } else {
            System.out.println("Deine Zahl ist gleich 900.(" + comma + ")");
        }
        if (multiplikation > 900){
            System.out.println("Deine Zahl ist größer als 900 (" + multiplikation + ")");
        } else if (multiplikation < 900){
            System.out.println("Deine Zahl ist kleiner 900. (" + multiplikation + ")");
        } else {
            System.out.println("Deine Zahl ist gleich 900.(" + multiplikation + ")");
        }
    }
}
