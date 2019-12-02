/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import static java.lang.Thread.sleep;

/**
 *
 * @author vld
 */
public class Watch {
	
	Hand hourHand = new HoursHand();
	Hand minuteHand = new MinutesHand();
	Hand secondHand = new SecondsHand();


	public void tick() throws InterruptedException{
		for (int h = 0; h<12; h++){

			System.out.println(hourHand.name+ " points on " + hourHand.getPosition());

			for (int m = 0; m<60; m++){

				if(m!=0){
					System.out.println(hourHand.name+ " points on " + hourHand.getPosition());
				}

				System.out.println(minuteHand.name+ " points on " + minuteHand.getPosition());
				minuteHand = minuteHand.clone();

				for (int s = 0; s<60; s++){

					System.out.println(secondHand.name + " points on " + secondHand.getPosition());
					sleep(1000);
					secondHand = secondHand.clone();

				}
				secondHand = new SecondsHand();
				
			}
			minuteHand = new MinutesHand();
		}
		hourHand = hourHand.clone();
	}
}
