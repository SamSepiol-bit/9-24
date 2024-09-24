/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlStructure;

import java.awt.BorderLayout;

/**
 *
 * @author hnd
 */
public class Switch {
    public static void main(String[] args){
        int day = 2;
        
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                     
        }
    }
    
}
