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
public class MinutesHand extends Hand {

	public static int position;

	public MinutesHand(MinutesHand hand) {
		super(hand);
		name = hand.name;
		position ++;
	}

	MinutesHand() {
		name = "Minute hand";
		handLength = "long";
		handWidth = "thin";
		position = 0;
	}

	@Override
	public Hand clone() {
		return new MinutesHand(this);
	}

	@Override
	public int getPosition() {
		return position;
	}
	
}
