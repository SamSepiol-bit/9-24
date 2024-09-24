/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopconcept;


import java.util.Scanner;
/**
 *
 * @author hnd
 */
public class Calculater {
    public static void main(String[] args){
        //create a Scanner object to get user input
        
        Scanner input = new Scanner(System.in);
        
        
        //promt the user to enter two integers
        System.out.println("Enter Fist number: ");
        int num1= input.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        
        //arithmatic opperaters
        int sum = num1+num2;
        int difference = num1-num2;
        int product =num1*num2;
        int remainder = num1&num2;
        int qoutient = num1/num2;
        
        System.out.println("Sum "+ sum);
        System.out.println("difference "+ difference);
        System.out.println("porduct " + product);
        System.out.println("reminder " + remainder);
        System.out.println("Qoutient " + qoutient);
        
        boolean isEqual = num1 == num2;
        boolean isGreater = num1 > num2;
        boolean isSmaller = num1 < num2;
        
        //logical opperation
       System.out.println("Are the 2 numbers equal "+ isEqual);
       System.out.println("Is the 1st number grater than the 2nd "+   isGreater);
       System.out.println("Is the 1st number less than 2nd "+ isSmaller);
      
       input.close();
    }
    
    
}
