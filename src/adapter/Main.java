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
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===New properties are saved and can be used on different devices===");
		Settings props1 = Settings.getInstance();
		Settings props2 = Settings.getInstance();
		
		props1.addProperties("computer");

		System.out.println(".....You can check your settings from all your systems");
		System.out.println("From computer:");
		props1.show();
		System.out.println("From your phone:");
		props2.show();

		
		props2.addProperties("phone"); 
		System.out.println("***New properties was edited on phone***");
		props2.show();
		System.out.println("***The same properties are shown on computer***");
		props1.show();

		 
	}
	
}
