package com.company;

public class Methode2 {



     public static void main(String[] args) {

         String str = "learning by doing";

         getLength(str);
         getFancy(str);

    }

    public static void getLength(String str){
        int length = str.length();

        if (length > 20){
            System.out.println("Der Satz hat " + length +" Buchstaben, also mehr als 20.");
        } else if (length < 20){
            System.out.println("Der Satz hat " + length +" Buchstaben, also weniger als 20.");
        } else {
            System.out.println("Der Satz hat " + length +" Buchstaben, also gleich 20.");
        }

    }

    public static void getFancy(String str){

        System.out.println("Befindet sich ein Teil von fancy im Satz?(" +str.contains("fancy") +")");

    }
}
