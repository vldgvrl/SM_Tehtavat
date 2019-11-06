/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductA2 vastaava luokka
 */
public class AdidasCap implements Adidas{

	String cap = "Adidas lippis";

	@Override
	public String toString() {
		return cap;
	}

	
}
