/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

    A byte is an 8-bit signed integer.
    A short is a 16-bit signed integer.
    An int is a 32-bit signed integer.
    A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.*/
/* Sample Input : 

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

*/

/*
 Sample Output : 
 -150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 */

import java.util.*;

public class Sample1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Long T = sc.nextLong();
		Long UL = 9223372036854775807L;
		Long LL = -9223372036854775808L;
		while(T > 0) {
			try {
				Long N = sc.nextLong();
				System.out.println(N + " can be fitted in : ");
				if(N <= 127 && N >= -128) {
					System.out.println(" * Byte");
				}
				if(N <= 32767 && N >= -32768) {
					System.out.println(" * Short");
				}
				if((N <= 2147483647) && (N >= -2147483648)) {
					System.out.println(" * Int");
				}
				if((N <= UL) && (N >= LL)) {
					System.out.println(" * Long");
				}
			}
			catch(Exception e) {
				System.out.println("The value can't be fitted anywhere.");
			}
			T--;
		}
	}
}