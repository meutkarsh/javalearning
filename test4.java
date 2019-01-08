//to check that if a string contains another string
package test;

public class test4 {
	public static void main(String[] args) {
		String s1 = "Sachin Tendulkar is a Cricketer";
		String s2 = "is";
		String C[] = s1.split(" ");
		int flag = 0;
		for(String ch : C) {
			if(ch.equals(s2)) {
				flag = 1;
			}
		}
		if(flag == 1)
			System.out.println("Yes it Contains : "+ s2);
		else
			System.out.println("No it doesn't Contains : "+ s2);
	}
	
}
