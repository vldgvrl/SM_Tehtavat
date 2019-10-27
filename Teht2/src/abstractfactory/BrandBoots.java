/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ConcreteFactory1 vastaava luokka
 */
public class BrandBoots implements MyClothes{

	public Adidas wearAdidas() {
		return new AdidasBoots();	
	}

	public Boss wearBoss() {
		return new BossBoots();
	}
}