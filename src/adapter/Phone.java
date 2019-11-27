/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;


/**
 *
 * @author vld
 */
public class Phone extends PhoneBrand implements Properties {

	private String name;
	
	Phone(String name) {
	
		this.name = name;
	}

	@Override
	public String toString(){

		return name + checkBrand(name);
	}


	
	
}
