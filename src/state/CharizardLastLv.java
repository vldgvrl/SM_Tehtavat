package state;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vld
 */
public class CharizardLastLv extends PokemonState{

	private static String name;
	
	public static PokemonState getInstance() {
		CharizardLastLv ch = new CharizardLastLv();
		name = "Charizard";
		return ch;
	}

	@Override
	public void whoAreYou(){
		System.out.println("I am " + name);
	}

	@Override
	public void whatYouCanDo(){
		System.out.println("I can burn all around me" );
		System.out.println("I can run fast" );
		System.out.println("I can fly" );
	}

	@Override
	public void evolution(){
		System.out.println("I can't evolute any more");
	}

}
