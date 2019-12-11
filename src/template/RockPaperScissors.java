/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.Random;

/**
 *
 * @author vld
 */
public class RockPaperScissors extends Game {

	String handsign;
	int winner=-1;
	int ekaPl, tokaPl;
	


	@Override
	void initializeGame() {
		System.out.println("Rock!\nPaper!\nScissors!\n");
		System.out.println("...........");
	}

	@Override
	void makePlay(int player) {

		Random rand = new Random();
		int sign = rand.nextInt(3);

			switch(sign){
				case 0:
					handsign = "rock";
					break;
				case 1: 
					handsign = "paper";
					break;
				case 2: 
					handsign = "scissors";
					break;
			}
			System.out.println("Player number " + (player+1) + " throws: " + handsign);

			if (player == 0){
				ekaPl = sign;
				winner = -1;
			}else{
				tokaPl = sign;
				if(ekaPl > tokaPl && tokaPl != 0 || ekaPl == 0 && tokaPl == 2){
					winner = 1;
				}else if (ekaPl == tokaPl){
					winner = -1;
				}else{
					winner = 2;
				}
				ekaPl=0;
				tokaPl=0;
			}

	}



	@Override
	boolean endOfGame() {
		if(winner == -1){
			return false;
		}
		return true;
	}

	@Override
	void printWinner() {
		System.out.println("Player number " + winner + " is the winner!");
	}
	
}
