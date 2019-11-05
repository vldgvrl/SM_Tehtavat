/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paivitetty_observer;

import java.util.Observable;

/**
 *
 * @author vld
 */
public class ClockTimer extends Observable{
	//muuttujat
	private int hour=0, minute=0, second=0;

	public int getHour(){
		return hour;	
	}
	
	public int getMinute(){
		return minute;	
	}	

	public int getSecond(){
	
		return second;
	}

	void tick(){
		if (second == 60){
			second = 0;
			if(minute==60){
				minute = 0;
				if (hour ==25){
					hour = 0;
				}else{
					hour += 1;
				}
			}else{
				minute += 1;
			}
		}else{
			second += 1;
		}
		setChanged();
		notifyObservers();
	}

}
