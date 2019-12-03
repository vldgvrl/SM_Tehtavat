/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 */
public class Adidas implements Shop{

	@Override
	public BrandBoots getBoot() {
		return new AdidasBoots();
	}

	@Override
	public BrandCaps getCap() {
		return new AdidasCap();
	}

	@Override
	public BrandJeans getJeans() {
		return new AdidasJeans();
	}

	@Override
	public BrandTShirts getTShirt() {
		return new AdidasTShirt();
	}
	
}
