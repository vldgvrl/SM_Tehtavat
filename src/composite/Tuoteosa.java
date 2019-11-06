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
public abstract class Tuoteosa extends TuoteRyhma{
	
	protected String nimi;
	protected double hinta;

	@Override
	public double getHinta(){
		return this.hinta;
	}	

}
