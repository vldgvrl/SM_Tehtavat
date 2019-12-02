/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * Hands are showing the time in analog clock
 */
public abstract class Hand {

	protected String handLength, handWidth, name;

	Hand(){}

	public Hand(Hand hand) {
		this.handLength = hand.handLength;
		this.handWidth = hand.handWidth;
	}

	public abstract Hand clone();
	public abstract int getPosition();
	
	
	
}
