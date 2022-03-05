/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 5, 2021
* Description:
* This is a program that calculates the subtotal, tax amount and final amount of a purchase given what the user wants to buy
* Displays subtotal, tax amount and final amount in $
*/

import java.util.Scanner; //used for input

class Main {
  public static void main(String[] args) {
    //declare variables and constants
    Scanner typedInput = new Scanner(System.in);//scanner object used for keyboard input
    int usbNumber; //to store number of USBs purchased
    int keyboardNumber; //to store number of keyboards purchased
    int mouseNumber; //to store number of mice purchased
    double subTotal; // to store calculated subtotal
    double taxValue; // to store calculated tax value
    double finalTotal; // to store calculated final total 
    String finalStatement; // to store final statement user will receive
    final double USB_PRICE = 19.99; //to store USB price constant
    final double KEYBOARD_PRICE = 49.99; //to store keyboard price constant
    final double MOUSE_PRICE = 25.99; //to store mouse price constant
    final double TAX_RATE = 0.13; //to store tax rate constant

    //data input
    System.out.print("How many USB's do you want to buy? "); //ask number of USBs user purchased
    usbNumber = typedInput.nextInt(); // get user's input
    System.out.print("How many keyboard's do you want to buy? "); //ask number of keyboards user purchased
    keyboardNumber = typedInput.nextInt(); //get user's input
    System.out.print("How many mice do you want to buy? "); //ask number of mice user purchased
    mouseNumber = typedInput.nextInt(); //get user's input

    //data processing
    subTotal = (usbNumber * USB_PRICE) + (keyboardNumber * KEYBOARD_PRICE) + (mouseNumber * MOUSE_PRICE); //calculates the subtotal of the user's purchases
    taxValue = subTotal * TAX_RATE; //calculates the value of tax the user owes
    finalTotal = subTotal + taxValue; //calculates the final value the user owes

    //display processed data to user
    //prepare final statement
    finalStatement = "Your the sub total is $" + subTotal + "\n" + "The tax value is $" + taxValue + "\n" + "Your final total is $" + finalTotal; 
    /*
    * /n goes to the next line
    * + concentrates the text and double values
    */
    System.out.println(finalStatement); //display final statement to user
    typedInput.close(); //close Scanner object

  }
}