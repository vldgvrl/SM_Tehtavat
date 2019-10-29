/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author vld
 */
public class Kotelo extends Tuoteosa{

	public Kotelo() {
		this.nimi = "Fractal Design Define R6 - ATX-kotelo ilman virtalähdettä, musta";
		this.hinta = 141.90;
		this.yhdessaEur = hinta;
	}
		
	public void tulosta() {
		System.out.println(nimi + " || " + hinta + "€");

	}
}
