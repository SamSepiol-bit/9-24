/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopconcept;

/**
 *
 * @author hnd
 */
public class LogicalOpperaters {
   public static void main(String[] args){
       boolean hasJob= true;
       boolean hasSavings = false;
       
       //logical opperation
       System.out.println("AND operator "+ (hasJob && hasSavings));
       System.out.println("OR operator "+ (hasJob || hasSavings));
       System.out.println("NOT operator "+ (! hasSavings));
   } 
}
