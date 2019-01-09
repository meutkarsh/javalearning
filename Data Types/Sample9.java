import java.util.Scanner;

//Java program to convert binary number to decimal
public class Sample9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int decimal = 0;
		int remainder, i = 0;
		while(binary > 0) {
			remainder = binary%10;
			binary = binary/10;
			decimal = decimal + (int)(remainder * Math.pow(2, i++));
		}
		System.out.println(decimal);
	}
}
