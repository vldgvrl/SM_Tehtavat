/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 * ConcreteFactory3 vastaava luokka
 */
public class BrandJeans implements MyClothes{

	public Adidas wearAdidas() {
		return new AdidasJeans();	
	}

	public Boss wearBoss() {
		return new BossJeans();
	}
}
