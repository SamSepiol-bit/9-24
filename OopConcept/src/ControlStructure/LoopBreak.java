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
public class LoopBreak {
    public static void main(String[] args){
        //for loop break statment
        for (int i = 1; i<=10; i++){
            if(i ==5){
                break;//brake the loop when i is 5
            }
            System.out.println("Break: "+i);
        }
    }
    
}
