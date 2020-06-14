package designPatterns;

import java.time.LocalDateTime;

public class Assignment2_7 {

	public static void main(String[] args) {
		Teasmade teasmade = new Teasmade();
		teasmade.displayTime();
		teasmade.ringAlarm();
		teasmade.playTune();
		teasmade.makeDrink();
	}// main
}// class

class Teasmade {
	private Radio radio;
	private Alarm alarm;
	private Clock clock;
	
	public Teasmade() {
		this.radio = new Radio();
		this.alarm = new Alarm();
		this.clock = new Clock();
	}	
	
	public void makeDrink() {
		System.out.println("Hey wake up, your tea is ready!");
	}
	
	public void ringAlarm() {
		this.alarm.ringAlarm();
	}
	
	public void playTune() {
		this.radio.playTune();
	}
	
	public void displayTime() {
		this.clock.displayTime();
	}
	
	class Radio {
		public void playTune() {
			System.out.println("I got you babe");
		}
	}// class
	
	class Alarm {
		public void ringAlarm() {
			System.out.println("Beep Beep");
		}
	}// class
	
	class Clock {
		public void displayTime() {
			System.out.println("Time: " + LocalDateTime.now());
		}
	}// class
}// class

