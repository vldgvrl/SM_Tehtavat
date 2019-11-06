/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


/**
 *
 * @author vld
 */
public class DigitalClock implements Observer {
	private ClockTimer timer;
	public DigitalClock(ClockTimer ct){
		timer = ct;
		timer.attach(this);
	}
	
	@Override
	public void update(Subject s){
		if (s == timer){ 
			draw();
		}
	}

	private void draw(){
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();

		System.out.println("Kelo näyttää: " + hour + ":" + minute + ":" + second);
	}	
}