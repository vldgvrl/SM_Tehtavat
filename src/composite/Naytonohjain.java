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
public class Naytonohjain extends Tuoteosa{

	public Naytonohjain() {
		this.nimi = "Asus ROG-STRIX-RTX2080TI-A11G-GAMING GeForce RTX 2080 Ti 11264 Mt -näytönohjain PCI-e-väylään";
		this.hinta = 1539.90;
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
