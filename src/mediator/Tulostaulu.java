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
public class Tulostaulu {

	private ArrayList<Tulosrivi> taulu = new ArrayList<Tulosrivi>();

	public void lisaaTauluun(Tulosrivi tulosrivi){
		taulu.add(tulosrivi);
	}

	public void naytaaTaulu(){
		System.out.println("********************************************");
		for (Tulosrivi t : taulu){
			System.out.println("*\t" + t.tulos() + "\t*");
		}
		System.out.println("********************************************");
	}
	
}
