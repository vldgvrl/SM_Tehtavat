/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vld
 */
public class RockPaperScissors extends Game {

	Random rand = new Random(3);
	String handsign;
	int winner=3;
	private int playersCount = 0;
	boolean paper=false, scessors=false, rock=false;


	@Override
	void initializeGame() {
		System.out.println("Rock!\nPaper!\nScissors!\n");
		System.out.println("...........");
	}

	@Override
	void makePlay(int player) {

		System.out.println(player);
		if (player > playersCount || player == 0 && playersCount == 0){


			playersCount=player;

			rand = new Random();

				System.out.println(rand.nextInt(3));

				switch(rand.nextInt(3)){
					case 0:
						handsign = "rock";
						rock = true;
						break;
					case 1: 
						handsign = "paper";
						paper = true;
						break;
					case 2: 
						handsign = "scissors";
						scessors = true;
						break;
				}
				System.out.println("Player number " + (player+1) + "throws: " + handsign);

			
		}else{
			winner=player+1;
		}


}

	@Override
	boolean endOfGame() {
		if(winner == 3){
			return false;
		}
		return true;
	}

	@Override
	void printWinner() {
		System.out.println("Player number " + winner + " is the winner!");
	}
	
}
