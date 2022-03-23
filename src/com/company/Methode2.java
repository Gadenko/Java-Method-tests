package com.company;

public class Methode2 {

     public static void main(String[] args) {

         String str = "learning by doing";

         getLength(str);
         lookingforFancy(str);
         sayHello();
         sayGoodbye();

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

    public static void lookingforFancy(String str){

        System.out.println("Befindet sich ein Teil von fancy im Satz?(" +str.contains("fancy") +")");

    }

    public static void sayHello(){

        System.out.println("I just want say hello!!!!");

    }

    public static void sayGoodbye(){
        System.out.println("I just wanna say goodbye!!!!");
    }
}
