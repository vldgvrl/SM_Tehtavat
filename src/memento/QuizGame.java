/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author vld
 */
public class QuizGame {
		
	private int guessValue;

	public Object save(){
		return new GuessValue();
	}

	public void show(Object obj){
		GuessValue value = (GuessValue) obj;
		this.guessValue = value.value;
	}

	private class GuessValue {

		Random rand;
		private int value;

		public GuessValue(){
			rand = new Random();
			value = rand.nextInt(11);
		}

		public int getValue() {
			return value;
		}
	}

	public synchronized Object joinGame(Player player) {

		Object o = this.save();
		this.show(o);
		//System.out.println(this.guessValue);
		return o; 
	}

	public synchronized boolean guess(Player player, Object guessValue){

		GuessValue guessV = (GuessValue) guessValue;
		this.guessValue = guessV.value;

			System.out.println("Arvuuttaja palauttaa: " + this.guessValue + 
				". Asiakas yrittää arvata " + player.myNumber());

		if (guessV.value == player.myNumber()){
			return true;
		}else{
			return false;
		}
	}
}
