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
public class Muistipiiri extends Tuoteosa{

	public Muistipiiri() {
		this.nimi = "G.Skill Ripjaws V DDR4 3200 Mhz 32 Gt -muistimodulipaketti";
		this.hinta = 163.90;
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
