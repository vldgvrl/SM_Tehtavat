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
public class Tulosrivi {

	private String tieto;
	private int[] arvostelut;
	private float yhteensa;

	public void setYhteensa(float yhteensa) {
		this.yhteensa = yhteensa;
	}

	public Tulosrivi(String tieto, int[] arvostelut) {
		this.tieto = tieto;
		this.arvostelut = arvostelut;
	}


	public String tulos(){
		String arvotRivissa = "";
		for (int a : arvostelut){
			arvotRivissa += (a + " ");
		}
		return tieto + " | " + arvotRivissa + " | " + "Yht: " + yhteensa;

	}
	
}
