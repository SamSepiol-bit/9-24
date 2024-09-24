/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlStructure;

/**
 *
 * @author hnd
 */
public class IfElse {
    public static void main(String[] args){
        int number = 13;
        
        // if statment
        if (number> 0){
            System.out.println("The Number is positive");
        }else{
            System.out.println("The number is negative");
        }
        
        if (number % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is Odd");
        }
        
    }
    
}
