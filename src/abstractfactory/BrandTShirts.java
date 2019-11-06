/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ConcreteFactory4 vastaava luokka
 */
public class BrandTShirts implements MyClothes{

	public Adidas wearAdidas() {
		return new AdidasTShirt();	
	}

	public Boss wearBoss() {
		return new BossTShirt();
	}
}