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
public class Mittamies {

	private int pituus;

	public int mittaa(double pituus){

		this.pituus = (int) Math.round(pituus);
		return this.pituus;

	}
	
}
