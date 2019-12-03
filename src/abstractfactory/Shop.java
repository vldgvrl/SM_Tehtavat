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
public interface Shop {

	public BrandBoots getBoot();
	public BrandCaps getCap();
	public BrandJeans getJeans();
	public BrandTShirts getTShirt();
	
}
