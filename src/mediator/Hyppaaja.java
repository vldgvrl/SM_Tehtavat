/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author vld
 */
public abstract class Hyppaaja {

	public String nimi;
	public int numero;

	public Hyppaaja() {
	}

	
	public String annaNimiJaNumero() {
		return nimi + ", numero " + numero;
	}

	public abstract void hyppaa();
	public abstract double getPituus();
	public abstract int getTyylipisteet();


}
