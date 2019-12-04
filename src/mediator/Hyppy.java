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
public class Hyppy extends Hyppaaja{

	private int hyppyNro = 0;
	private static int hyppyMax;
	private double hPituus = 0;
	private int[] tyylipisteet = new int[hyppyMax];
	Random rand= new Random();

	public Hyppy(int maara) {
		hyppyMax = maara;
	}

	public Hyppy(String nimi, int numero) {
		super.nimi = nimi;
		super.numero = numero;
	}


	public void hyppaa(){

		tyylipisteet[hyppyNro] = rand.nextInt(10) + 1;

		hyppyNro++;

	}

	public double getPituus() {
		return hPituus;
	}

	public int getTyylipisteet() {
		return tyylipisteet[hyppyNro-1];
			
	}


	

	
	
	
}
