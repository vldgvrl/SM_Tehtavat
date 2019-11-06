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
public class Emolevy extends Tuoteosa{

	public Emolevy() {
		this.nimi = "Asus ROG STRIX X299-E GAMING Intel LGA2066 ATX emolevy";
		this.hinta = 206.90; 
		this.yhdessaEur = hinta;
	}

	public void tulosta() {
		System.out.println(nimi + " || " + hinta + "€");
	}
}
