//To Check whether one String is a rotaion of another

public class test1 {

	public static void main(String[] args) {
		String s1 = "UTKARSH";
		String s2 = "ARSHUTK";
		
		String s3 = s1 + s1;
		
		//System.out.println(s3);
		
		if(s3.contains(s2)) {
			System.out.println("Yes " + s2 + " is a rotation of " + s1);
		}
	}
}
