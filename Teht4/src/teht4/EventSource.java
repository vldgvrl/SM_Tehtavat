/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht4;

import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author vld
 */
public class EventSource extends Observable implements Runnable {
	
	ClockTimer timer = new ClockTimer();
	Observer clock = new DigitalClock(timer);
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String response = scanner.next();
			timer.tick();
			setChanged();
			notifyObservers();
		}
	}	
}
