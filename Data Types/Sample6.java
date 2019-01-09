//find Factorial of a very large number
import java.math.BigInteger;
import java.util.Scanner;

public class Sample6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();
		String number = Long.toString(num);
		BigInteger one = new BigInteger("1");
		BigInteger bigNumber = new BigInteger(number);
		BigInteger factorial = new BigInteger("1");
		while(bigNumber.compareTo(one) != 0) {
			factorial = factorial.multiply(bigNumber);
			bigNumber = bigNumber.subtract(one);
		}
		System.out.println(factorial);
	}
}
