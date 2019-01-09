//Java program to break an integer into a sequence of individual digits.
import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[10];
		int r, i = 0;
		while(N > 0) {
			r = N%10;
			N = N/10;
			num[i++] = r;
		}
		
		while(i > 0) {
			System.out.println(num[--i]);
		}
	}
}
