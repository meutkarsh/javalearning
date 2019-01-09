//Java program to convert minutes into a number of years and days.
import java.util.ArrayList;
import java.util.Scanner; 

class Sample3 
{ 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();
		
		int hours = minutes/60;
		minutes = minutes%60;
		
		int days = hours/24;
		hours = hours%24;
		
		int years = days/365;
		days = days%365;
		
		System.out.println("Number of Years : " + years);
		System.out.println("Number of Days : " + days);
	}
} 
