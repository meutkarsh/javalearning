//Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
import java.util.Scanner;

class Sample4 
{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meters = sc.nextInt();
		
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int seconds = sc.nextInt();
		
		int totalSeconds = (hours*60*60) + (minutes*60) + seconds;
		double speedInMeterPerSec = (double) meters/totalSeconds;
		System.out.println("Speed in m/sec : " + speedInMeterPerSec);
		
		double totalHours = hours + (double)minutes/60 + (double)seconds/(60*60);
		double kilometers = (double) meters/1000;
		System.out.println("Speed in km/h : " + kilometers/totalHours);
		
		double totalMiles = (double)meters/1609;
		System.out.println("Speed in miles/hour : " + totalMiles/totalHours);
	}
} 
