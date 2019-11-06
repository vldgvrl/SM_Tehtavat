/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author vld
 */
public class Main {
	
	public static void main(String[] args) {
		
		Singleton props1 = Singleton.getInstance();
		Singleton props2 = Singleton.getInstance();
		
		props1.addProperties("computer");
		System.out.println("===New properties saved on computer===");
		props1.show();
		System.out.println("===The same properties are on the mobile phone.====");
		props2.show();

		
		props2.addProperties("phone"); 
		System.out.println("***New properties was edited on phone***");
		props2.show();
		System.out.println("***The same properties are used on computer***");
		props1.show();

		 
	}
	
}
