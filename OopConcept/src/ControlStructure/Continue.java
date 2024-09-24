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
public class Continue {
    public static void main(String[] args){
        //for loop with the continue statment
        
       
            
            for (int i = 1; i <= 5; i++){
                if(i == 3){
                continue;
                }
                System.out.println("Number: " +i);
            }
            
        }
}
