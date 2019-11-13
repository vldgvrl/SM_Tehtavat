/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author vld
 */
public class Main {
	
	public static void main(String[] args) {
		
		Charmander charmander = new Charmander();

		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		System.out.println("Charmander evolution");
		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		System.out.println("Charmander last evolution");
		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		
	}
	
}
