/**
 * 
 */
package org.ictkerala.student;

import java.util.Scanner;

/**
 * 
 */
public class FoodMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== FOOD MENU =====");
        System.out.println("1. Burger - Rs.120");
        System.out.println("2. Pizza  - Rs.250");
        System.out.println("3. Sandwich - Rs.80");

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Item Number: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Burger Selected");
                break;
            case 2:
                System.out.println("Pizza Selected");
                break;
            case 3:
                System.out.println("Sandwich Selected");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();

	}

}
