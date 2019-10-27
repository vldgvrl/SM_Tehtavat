/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 *ProductA4 vastaava luokka

 */

public class AdidasTShirt implements Adidas{

	private String jeans = "Hyvä näköinen adidas T-paita";

	@Override
	public String toString() {
		return jeans; 
	}
	
}
