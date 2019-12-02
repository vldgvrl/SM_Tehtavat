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
public class SecondsHand extends Hand{

	public static int position;

	public SecondsHand(SecondsHand hand) {
		super(hand);
		name = hand.name;
		position ++;

	}

	SecondsHand() {
		name = "Second hand";
		handLength = "long";
		handWidth = "very thin";
		position = 0;
	}

	@Override
	public Hand clone() {
		return new SecondsHand(this);
	}

	@Override
	public int getPosition() {
		return position;
	}
	
}
