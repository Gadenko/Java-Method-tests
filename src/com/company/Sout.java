package com.company;

public class Sout {

    public static void main(String[] args) {

        String name = "David";                // Variable für Namen
        String city = "Hamburg";            // Variable von einer Stadt
        String birthplace = "Dresden";

        int birthyear = 1989, age = 32, sum = birthyear + age;


        System.out.println("Ich heiße " + name + ", und bin " + age + " alt."); /* Hier werden die Variablen eingesetzt
         mit dem Operator "+" */
        System.out.println("Ich wohne in " + city + ".");
        System.out.println("Geboren bin ich aber in " + birthplace + " im Jahr " + birthyear + ".");
        System.out.println("Die Summe ist = " + sum);                //Summen ausgabe für sum
        System.out.println("Die Summe ist = " + (age + birthyear));    //Ausgabe birthyear und age Zusammengerechnet

    }
}