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
public class Cabinet {
	
	MyClothes cap = new BrandCaps();
	MyClothes boots = new BrandBoots();
	MyClothes tShirt = new BrandTShirts();
	MyClothes jeans = new BrandJeans();

	void wearToSchool(){
		System.out.println(cap.wearAdidas());
		System.out.println(boots.wearAdidas());
		System.out.println(tShirt.wearAdidas());
		System.out.println(jeans.wearAdidas());
		
	}	
	
	void tellWhatOnMe() {
		System.out.println(cap.wearBoss());	
		System.out.println(boots.wearBoss());	
		System.out.println(tShirt.wearBoss());	
		System.out.println(jeans.wearBoss());	
	}
}