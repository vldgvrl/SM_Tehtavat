/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;

/**
 *
 * @author vld
 */
public class Kisasihteeri {

	private int[] arvostelut;
	private float kokoArvo;
	private ArrayList<Integer> kokoArvoYhteensaList = new ArrayList<>();

	public float yhteensa(int[] arvot){
		arvostelut = arvot;
		int sum = 0;
		for (int i : arvostelut){
			sum += i;
		}

		kokoArvo = sum / arvostelut.length;

		//kokoArvoYhteensaList.add((double)Math.round(kokoArvo));
		return kokoArvo; 
	}

	public int kokoArvoYhteensa(){
		int sum = 0;
		for (Integer i : kokoArvoYhteensaList){
			sum += i;
		}

		int kokoArvoYhteensa = sum / kokoArvoYhteensaList.size();

		return kokoArvoYhteensa;
		
	}
	
}
