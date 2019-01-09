//Java program to convert hexadecimal number to decimal
import java.util.Scanner;

public class Sample10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = 0;
		String hexaDecimal = sc.next();
		sc.close();
		int j = 0;
		for(int i = hexaDecimal.length()-1; i >= 0; i--) {
			
			if((int)(hexaDecimal.charAt(i)-48) < 10) {
				decimal = decimal + (int)((hexaDecimal.charAt(i)-48) * Math.pow(16, j++));
			}
			else if((char)(hexaDecimal.charAt(i)-55) >= 10) {
				decimal = decimal + (int)((hexaDecimal.charAt(i)-55) * Math.pow(16, j++));
			}
		}
		System.out.println(decimal);
	}
}