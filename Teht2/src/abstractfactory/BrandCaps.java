/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ConcreteFactory2 vastaava luokka
 */
public class BrandCaps implements MyClothes{

	public Adidas wearAdidas() {
		return new AdidasCap();	
	}

	public Boss wearBoss() {
		return new BossCap();
	}
}

