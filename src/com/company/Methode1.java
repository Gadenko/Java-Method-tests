package com.company;

public class Methode1 {

    public static void main(String[] args) {

        int x = 5, y = 3, z = 100;
        getNumber(x, y);
        getSum(x, y);

        if (getNumber(x, y) > 100){
            System.out.println("Die Zahl " + getNumber(x, y) + ", ist größer als " + z +".");
        } else if (getNumber(x, y) <100){
            System.out.println("Die Zahl " + getNumber(x, y) + ", ist kleiner als " + z +".");
        } else {
            System.out.println("Die Zahl " + getNumber(x, y) + ", ist gleich " + z +".");
        }

    }

    public static int getNumber(int x, int y){
        return x + y;
    }


    public static int getSum(int x, int y){
        System.out.println("Summe: " + (x + y) + ".");
        return x + y;
    }
}
