/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.Random;

/**
 *
 * @author vld
 */
public class Arvostelutuomarit {

	private int[] arvot;
	private int maara;


	public Arvostelutuomarit(int maara) {
		this.maara = maara;

	}

	public int[] arvostaa(int pituus, int tyyli){
		arvot = new int[maara];
		int arvo;

		for (int i = 0; i<maara; i++){

			Random rand = new Random();
			if (pituus>200){
				arvo = (rand.nextInt(4) + 8 + tyyli)/2;
			}else if(pituus>100){
				arvo = (rand.nextInt(4) + 5 + tyyli)/2;

			}else{
				arvo = (rand.nextInt(4) + 3 + tyyli)/2;
			}

			arvot[i]=arvo;
		}


		return arvot;


	}

	
}
