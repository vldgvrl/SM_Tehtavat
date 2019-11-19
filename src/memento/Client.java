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
public class Client extends Thread {

	Random random;

	public void run(){

		random = new Random();
		
		QuizGame game = new QuizGame();
		Player player = new Player("My name", random.nextInt(11));
		Object myGame = game.joinGame(player);
		boolean response = game.guess(player, myGame);
		if (response){
			System.out.println("Olet voitanut! Luvut ovat sama." + 
				"Sinun numero oli: " + player.myNumber());
		}else{
			System.out.println("Luvut ei ollut sama.");
		}

	}
	
}
