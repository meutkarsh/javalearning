//convert a decimal number to hexadecimal
import java.util.Scanner;

public class Sample7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		char hexaDecimal[] = new char[20];
		int i = 0, remainder;
		while(decimal > 0) {
			remainder = decimal%16;
			decimal = decimal/16;
			if(remainder < 10) {
				hexaDecimal[i++] = (char)(48 + remainder);
			}
			else if(remainder > 10) {
				hexaDecimal[i++] = (char)(55 + remainder);
			}
		}
		
		while(i > 0) {
			System.out.println(hexaDecimal[--i]);
		}
	}
}
