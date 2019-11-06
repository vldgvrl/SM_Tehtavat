/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vld
 */
public class TuoteRyhma implements Tietokone{

	List<Tietokone> tuoteList = new ArrayList<Tietokone>();

	//Jokaiselle konkreettissa tehdassa konstruktorissa on lisätty suoraan
	//tuotteen hinta muuttujille "yhdessaEur" joten voidaan helposti laskea 
	//kokoonpanojen hintoja.

	public TuoteRyhma() {
	}
	protected double yhdessaEur=0.00;
	private double summa=0;

	public void setOsa(Tietokone ryhma) {
		tuoteList.add(ryhma);
		yhdessaEur += ryhma.getHinta();
	}

	public double laskeaHinnan() {
		System.out.println("**********");
		System.out.println("Tulosta koko summa ilman vaihtamalla konkrerttissa tehdassa: " + summa + "€");
		//Hinnan ilmoittava metodi joka palauttaa hinnan paluuarvona.
		return this.getHinta();
	}

	public void tulosta(){
		for (Tietokone r : tuoteList){
			r.tulosta();
			summa += r.getHinta();
		}
		
	}

	public double getHinta() {
		return this.yhdessaEur;
	}

	
}
