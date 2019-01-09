//Java program to convert binary number to hexadecimal
import java.util.Scanner;
import java.lang.Math;

public class Sample8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		char hexaDecimal[] = new char[20];
		int remainder, i = 0;
		while(binary > 0) {
			
			int j = 0;
			int digit = 0;
			
			while(j < 4) {
				remainder = binary%10;
				binary = binary/10;
				digit = digit + (int)(remainder * Math.pow(2, j++));
			}
			if(digit < 10) {
				hexaDecimal[i++] = (char)(48 + digit);
			}
			else if(digit >= 10) {
				hexaDecimal[i++] = (char)(55 + digit);
			}
		}
		
		while(i > 0) {
			System.out.print(hexaDecimal[--i]);
		}
	}
}
