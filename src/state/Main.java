/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import visitor.*;

/**
 *
 * @author vld
 */
public class Main {
	
	public static void main(String[] args) {
		
		Charmander charmander = new Charmander();

		Visitor bonus = new BonusVisitor();

		bonus.visit(charmander);

		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		bonus.visit(charmander);

		System.out.println("=====Charmander evolution=====");
		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		bonus.visit(charmander);

		System.out.println("=====Charmander last evolution=====");
		charmander.whoAreYou();
		charmander.whatYouCanDo();
		charmander.evolution();

		System.out.println("\n\n\nThere are also here two pokemons: ");

		Pikachu pika = new Pikachu();
		bonus.visit(pika);

		Bulbozavr bulb = new Bulbozavr();
		bonus.visit(bulb);

		
		
	}
	
}
