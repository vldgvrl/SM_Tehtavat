/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductA1 vastaava luokka
 */
public class AdidasBoots implements Adidas{

	private String boots = "Valkoiset adidas kengät";

	@Override
	public String toString() {
		return boots;
	}

	
}