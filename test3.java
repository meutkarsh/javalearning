package test;

public class test3 {
	public static void main(String[] args) {
		String s1 = "Sachin Tendulkar is a cricketer";
		String words[] = s1.split(" ");
		String result =  "";
		for(String w : words) {
			String f = w.substring(0, 1);
			String afterf = w.substring(1);
			
			f = f.toLowerCase();
			afterf = afterf.toUpperCase();
			
			result += f + afterf + " ";
		}
		System.out.println(result);
	}
}