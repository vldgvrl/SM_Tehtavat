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
public class CharmeleonMidleLv extends PokemonState{
	
	private static String name;
	
	public static PokemonState getInstance() {
		CharmeleonMidleLv ch = new CharmeleonMidleLv();
		name = "Charmelion";
		return ch;
	}

	@Override
	public void whoAreYou(Charmander pokemon){
		System.out.println("I am " + name);
	}

	@Override
	public void whatYouCanDo(Charmander pokemon){
		System.out.println("I can through big fire balls" );
		System.out.println("I can run slowly" );
		System.out.println("I can make high jumps" );
	}

	@Override
	public void evolution(Charmander pokemon){
		changeState(pokemon, CharizardLastLv.getInstance());
	}
}
