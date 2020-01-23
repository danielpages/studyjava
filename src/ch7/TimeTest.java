package ch7;

//import java.sql.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time1 t = new Time1(12, 35, 30);
		
		System.out.println(t);
		//t.hour = 13;
		t.setHours(t.getHours() + 1);
		System.out.println(t)

	}

}

class Time1{
	private int hour, minute, second;
	
	Time1(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second < 0 || second < 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}