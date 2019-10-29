package composite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vld
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Tietokone tietokone = new TuoteRyhma();
		Tietokone koteloRyhma = new TuoteRyhma();
		Tietokone emolevyRyhma = new TuoteRyhma();
		
		//luodan Toute
		Tietokone kotelo = new Kotelo();
		Tietokone emolevy = new Emolevy();
		Tietokone muistipiiri = new Muistipiiri();
		Tietokone naytonohjain = new Naytonohjain();
		Tietokone prosessori = new Prosessori();
		Tietokone verkkokortti = new Verkkokortti();

		//lisätään tuoteet emolevyn ryhmään
		emolevyRyhma.setOsa(emolevy);
		emolevyRyhma.setOsa(muistipiiri);
		emolevyRyhma.setOsa(naytonohjain);
		emolevyRyhma.setOsa(prosessori);
		emolevyRyhma.setOsa(verkkokortti);

		//lisätään emolevy kotelon ryhmään
		koteloRyhma.setOsa(kotelo);
		koteloRyhma.setOsa(emolevyRyhma);

		//lisätään kotelo tietokone ryhmään
		tietokone.setOsa(koteloRyhma);
		
		tietokone.tulosta();
		System.out.println("Yhdessä: " + tietokone.laskeaHinnan() + " €");


	}
	
}
