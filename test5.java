//to check if a String is valid shuffle of two String
package test;

public class test5 {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "efgh";
		String s3 = "aehbfgcd";
		if(s1.length() + s2.length() == s3.length()) {
			char c3[] = s3.toCharArray();
			for(char ch3 : c3) {
				if(!s1.equals("") && ch3 == s1.charAt(0)) {
					s1 = s1.substring(1);
					s3 = s3.substring(1);
				}
				else if(!s2.equals("") && ch3 == s2.charAt(0)) {
					s2 = s2.substring(1);
					s3 = s3.substring(1);
				}
			}
			if(s3.length() == 0) {
				System.out.println("Yes it is a valid shuffle of two strings");
			}
			else {
				System.out.println("No, it is not a valid shuffle");
			}
		}
	}
}