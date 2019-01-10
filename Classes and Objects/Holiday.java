public class Holiday {
	private String name;
	private int day;
	private String month;
	
	Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public boolean inSameMonth(Holiday holiday) {
		if(this.month.equals(holiday.month)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double avgDate(Holiday[] h) {
		int sum = 0;
		for(int i = 0; i < h.length; i++) {
			sum = sum + h[i].day;
		}
		double avgDate = (double)(sum/h.length);
		return avgDate;
	}
	
	public static void main(String[] args) {
		Holiday holiday = new Holiday("Independence Day", 4, "July");
		Holiday holiday1 = new Holiday("Pongal", 15, "January");
		Holiday holiday2 = new Holiday("Republic Day", 26, "January");
		Holiday holiday3 = new Holiday("Diwali", 7, "November");
		
		System.out.println(holiday1.inSameMonth(holiday2));
		
		Holiday[] holidays = {holiday, holiday1, holiday2, holiday3};
		System.out.println(avgDate(holidays));
	}
}