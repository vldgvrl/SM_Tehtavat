/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductB2 vastaava luokka
 */
public class BossCap implements Boss{

	String cap = "Boss lippis";

	@Override
	public String toString() {
		return cap;
	}
	
}
