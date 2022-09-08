package studio1;

import java.util.Scanner;

public class LeapYear {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 2020;
		
		boolean divisible = (input%4 == 0 && input%100>0 || input%400==0);

		
		System.out.print(input + " is a leap year: " + divisible);
		
	}

}
