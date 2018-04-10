//-----------------------------------------------------------
// Lawn.java
// Hafizi bin Ismail
// hbinisma / 1596229
// Programming Assignment 1 / lab1
// a (very) short description of the program
//-----------------------------------------------------------

import java.util.Scanner;

public class Lawn {
	public static void main(String [] args) {
		
		double length_lot, width_lot, area_lot;
		double length_house, width_house, area_house;
		double area_grass;
		double rate_mowing;
		Scanner sc = new Scanner(System.in);
		
		// Get the length and width of lot and house respectively, then get the area
		
		System.out.print("Enter the length and width of the lot, in feet: ");
		length_lot = sc.nextDouble();
		width_lot = sc.nextDouble();
		
		area_lot = length_lot * width_lot;
		
		System.out.print("Enter the length and width of the house, in feet: ");
		length_house = sc.nextDouble();
		width_house = sc.nextDouble();
		
		area_house = length_house * width_house;
		System.out.println("The lawn area is " + area_house + " square feet");
		
		// Finding the area that has grass (Lot area - house area)
		area_grass = area_lot - area_house;
		
		// Get the value of the rate of mowing down grasses, in ft sq
		System.out.print("Enter the mowing rate, in square feet per second : ");
		rate_mowing = sc.nextDouble();
		
		
		// Calculating the time it takes to mow down the grasses
		double time_mowing = area_grass / rate_mowing;
		
	
		int h, m, s;
		s = (int) Math.round(time_mowing);
		m = s / 60;
		s = s % 60;
		h = m / 60;
		m = m % 60;
		
	//	n = sc.nextInt();
	//	str = ( n==1 ? "singular" : "plural" );
	//	System.out.println(str)
		
		System.out.println("The mowing time is " + h + " hour" + (((h==1)||(h==0))?" ":"s ") + 
				   m + " minute" + (m==1?" and ":"s and ") + 
				   s + "second" + (s==1?".":"s."));
	}

}
