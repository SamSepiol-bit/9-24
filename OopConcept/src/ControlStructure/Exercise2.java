/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlStructure;

import java.util.Scanner;
/**
 *
 * @author hnd
 */
public class Exercise2 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter the number of cities: ");
        int numCities = scanner.nextInt();
        double average = 0;
        
        for(int i = 1 ; i <=numCities; i++){
            System.out.println("Enter temp of city: "+ i +": ");
            double temp = scanner.nextDouble();
            average += temp;
        }
        System.out.println("Average temp of city: " + average);
        
        System.out.println("---------");
        
        average = 0;
        System.out.println("Do you have more cities to register.(Yes/No)");
        String hasMorecities = scanner.next();
        
        while(hasMorecities.equalsIgnoreCase("Yes")){
            System.out.println("Enter temp of city: ");
            double temp = scanner.nextDouble();
            average += temp / numCities;
            
            System.out.println("Do you have more reister? (Yes/No): ");
            hasMorecities = scanner.next();
        }
        System.out.println("Average tenpreture of the cities registed is :"+average);
        
        System.out.println("---------------------------");
        
        average = 0;
        do{
            System.out.println("Enter the tempreture of cite: ");
            double temp = scanner.nextDouble();
            average += temp/numCities;
            System.out.println("Do you have more records");
            hasMorecities = scanner.next();
        }while (hasMorecities.equalsIgnoreCase("Yes"));
        System.out.println("Average of the register cities tepreture is "+ average);
        
        scanner.close();
    }
    
}
