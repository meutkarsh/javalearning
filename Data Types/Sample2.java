//Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
import java.util.Scanner;

public class Sample2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int remainder, sum = 0;
			while(number > 0) {
				remainder = number%10;
				number = number/10;
				sum = sum + remainder;
			}
			System.out.println(sum);
		}
}