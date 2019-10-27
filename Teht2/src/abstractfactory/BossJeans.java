/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductB3 vastaava luokka
 */
public class BossJeans implements Boss {

	String jeans = "farkut bossi:lta";
	
	@Override
	public String toString() {
		return jeans; 
	}
	
}
