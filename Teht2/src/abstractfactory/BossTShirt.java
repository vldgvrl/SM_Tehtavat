/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductB4 vastaava luokka
 */
public class BossTShirt implements Boss {

	private String jeans = "Hyvänäköinen boss T-paita";

	@Override
	public String toString() {
		return jeans; 
	}
	
}
