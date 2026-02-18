import java.lang.System;
import java.util.Scanner;

class GetUserInput {
    // we have to create an object for scanner 
    //this is how we create object

    public static void main(String args[]) {
    Scanner abi = new Scanner(System.in);   //here, Scanner is the class, abi is the object name and new is the keyword used to create an object and Scanner(System.in) is the constructor of the Scanner class which takes input from the user through the terminal.
    int num1 = abi.nextInt();  //this is how we take input from the user through the terminal. nextInt() is a method of the Scanner class which is used to take integer input from the user.
    int num2 = abi.nextInt();
    int sum = num1 + num2; //addition of two numbers
    System.out.println("The sum of num1 and num2 is: " + sum);
    }
}