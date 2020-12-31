package day05;

public class Test04_usingTime {

	public static void main(String[] args) {
		Time t1=new Time(15,30,0);
		t1.print();
		
//		double[] x;
//		double[] y;
//		// 묶어서 관리하는게 편함!
		Location loc= new Location();
	}
}

class Location{
	double x;
	double y;
	
}

// 필요한 정보 grouping! 
class Time{
	private int hour;
	private int minute;
	private int second;
	private boolean am;
	// 시간 정보 관리할게 많다. 
	// 묶여져야 의미있는 시간된다.(묶여주는 클래스를 모델링!)
	
	//source -> generate setters and getters
	public Time() {}
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		// 1~24
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void print() {
		System.out.printf("%d:%d:%d",hour, minute,second);
	}
	
}