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
public class Exercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter Second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter Third Number: ");
        int num3 = input.nextInt();
        
        //Determine the largest number using relational operators
        if(num1 > num2 && num1 >num3){
            System.out.println("The largest number is: "+ num1);
        }else if(num2 > num1 && num2 >num3){
            System.out.println("The largest number is: "+ num2);
        }else{
            System.out.println("The largest number is: "+ num3);
        }
        
        //cheak if at least one number is negative
        if (num1 < 0 || num2 < 0 || num3 <0){
            System.out.println("At least one number is negative.");
        }else {
            System.out.println("None of the numbers are negative.");
        }
        
        input.close(); 
        

        
        
        
    }
    
}
