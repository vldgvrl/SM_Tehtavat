/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paivitetty_observer;

/**
 *
 * @author vld
 */
public class Main {

	public static void main (String[] args){
		ClockTimer clock = new ClockTimer();
		DigitalClock digitalClock = new DigitalClock(clock);

		for (int i = 0; i < 86400; i++) {
			try {
				Thread.sleep(1000);
				clock.tick();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
