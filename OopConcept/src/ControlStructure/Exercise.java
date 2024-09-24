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
public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numItems = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= numItems; i++) {
            System.out.println("Enter price of item " +      i + ": ");
            double price = scanner.nextDouble();
            total += price;
        }
        System.out.println("Total cost of " + numItems + "Item is LKR" + total);

        System.out.println("_________________");

        total = 0;
        System.out.println("Do you have an item to scan? (Yes/No");
        String hasMoreItems = scanner.next();

        while (hasMoreItems.equalsIgnoreCase("Yes")) {
            System.out.println("Enter the price of Item: ");
            //store
            double price = scanner.nextDouble();
            total += price;

            System.out.println("Do You have another item to scan? (Yes/No)");
            hasMoreItems = scanner.next();  
        }
        System.out.println("Total cost for items scanned is: LKR " + total);

        System.out.println("---------------");

        total = 0;
        do {
            System.out.println("Enter the price of the Item: ");
            double price = scanner.nextDouble();
            total += price;
            System.out.println("Do ypu have another item to scan? (Yes/No)");
            hasMoreItems = scanner.next();
            } while (hasMoreItems.equalsIgnoreCase("Yes"));
        System.out.println("Total cost for the items scanner is: LKR" + total);
    }
}
