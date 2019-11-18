/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author vld
 */
public class Player {

	private String myName;
	private int myNumber;

	public Player(String myName, int myNumber) {
		this.myName = myName;
		this.myNumber = myNumber;
	}



	public int myNumber() {
		return myNumber;
	}
	
}
