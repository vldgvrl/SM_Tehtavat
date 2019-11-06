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
public class Prosessori extends Tuoteosa{

	public Prosessori() {
		this.nimi = "AMD Ryzen 9 3900X -prosessori AM4 -kantaan";
		this.hinta = 570.90;
		this.yhdessaEur = hinta;
	}

	public void tulosta() {
		System.out.println(nimi + " || " + hinta + "€");
	}
	
	public void setOsa(Tietokone t){
		throw new RuntimeException
			("Ei ole mahdollista lisätä tämän osiin mitään");
	}
	
	
}
