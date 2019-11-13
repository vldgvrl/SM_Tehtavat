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
public class CharmanderStartLv extends PokemonState {

	private static String name;
	private static CharmanderStartLv ch;
	
	public static PokemonState getInstance() {
		ch = new CharmanderStartLv();
		name = "Charmander";
		return ch;
	}
	
	@Override
	public void whoAreYou(Charmander pokemon){
		System.out.println("I am " + name);
	}

	@Override
	public void whatYouCanDo(Charmander pokemon){
		System.out.println("I can through smalls fire balls" );
		System.out.println("I can walk slowly" );
		System.out.println("I can make low jump" );
	}

	@Override
	public void evolution(Charmander pokemon){
		changeState(pokemon, CharmeleonMidleLv.getInstance());
	}
	


	
}
