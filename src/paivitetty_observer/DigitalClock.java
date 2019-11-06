/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paivitetty_observer;

import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author vld
 */
public class DigitalClock implements Observer {
	private ClockTimer timer;
	public DigitalClock(ClockTimer ct){
		timer = ct;
		timer.addObserver(this);
	}
	
	private void draw(){
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();

		System.out.println("Kelo näyttää: " + hour + ":" + minute + ":" + second);
	}	

	@Override
	public void update(Observable o, Object arg) {
		if (o == timer){ 
			draw();
		}
	}
}