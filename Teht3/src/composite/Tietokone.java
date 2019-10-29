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
public interface Tietokone {

	public abstract double laskeaHinnan();
	public abstract double getHinta();
	public abstract void setOsa(Tietokone ryhma);
	public abstract void tulosta();

}
