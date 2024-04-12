/*
5.Write a class Time with three data members to store hr, min and seconds.
Create two constructors and apply checks to set valid time. Also create display function which displays all data members.
*/
package javaassignment3;

public class Q5 { // Q5=TIME
	private int hr;
	private int min;
	private int sec;

	public Q5() {
		this(0, 0, 0);
	}

	public Q5(int hr, int min, int sec) {
		setTime(hr, min, sec);
	}

	public void setTime(int hr, int min, int sec) {
		if (hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		} else {
			System.out.println("Invalid time values. Time set to default (0:0:0).");
			this.hr = 0;
			this.min = 0;
			this.sec = 0;
		}
	}

	public void displayTime() {
		System.out.printf("Time: %02d:%02d:%02d\n", hr, min, sec);
	}

	public static void main(String[] args) {
		Q5 time1 = new Q5();
		Q5 time2 = new Q5(10, 30, 45);

		System.out.println("Time 1:");
		time1.displayTime();
		System.out.println("Time 2:");
		time2.displayTime();
	}
}
/*
Output:
Time 1:
Time: 00:00:00
Time 2:
Time: 10:30:45
*/