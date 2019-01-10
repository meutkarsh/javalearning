import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner(System.in);
	
	private int scores[] = new int[5];
	
	public void input() {
		for(int i = 0; i < 5; i++) {
			scores[i] = sc.nextInt();
		}
	}
	
	int calculateTotalScore() {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();

		Student students[] = new Student[n];
		
		for(int i = 0; i < n; i++) {
			students[i] = new Student();
		}
		
		for(int i = 0; i < n; i++) {
			students[i].input();
		}
		
		int utkarshScore = students[0].calculateTotalScore();
		int count = 0;
		for(int i = 1; i < n; i++){
	        int total = students[i].calculateTotalScore();
	        if(total > utkarshScore){
	            count++;
	        }
	    }
		
		System.out.println(count);
		
	}
}
