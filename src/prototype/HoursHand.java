/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author vld
 */
public class HoursHand extends Hand{

	public static int position;

	public HoursHand(HoursHand hand) {
		super(hand);
		name = hand.name;
		position ++;
	}

	HoursHand() {
		name = "Hours hand";
		handLength = "short";
		handWidth = "thick";
		
		position = 0;
	}

	@Override
	public Hand clone() {
		return new HoursHand(this);
	}

	@Override
	public int getPosition() {
		return position;
	}


	
}
