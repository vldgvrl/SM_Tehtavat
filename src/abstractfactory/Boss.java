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
public class Boss implements Shop{

	@Override
	public BrandBoots getBoot() {
		return new BossBoots();
	}

	@Override
	public BrandCaps getCap() {
		return new BossCap();
	}

	@Override
	public BrandJeans getJeans() {
		return new BossJeans();
	}

	@Override
	public BrandTShirts getTShirt() {
		return new BossTShirt();
	}
	
}
