/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ProductB1 vastaava luokka
 */
public class BossBoots implements Boss {

	private String boots = "Valkoiset boss kengät";

	@Override
	public String toString() {
		return boots;
	}
}
