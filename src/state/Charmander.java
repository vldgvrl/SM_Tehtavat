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
public class Charmander {
	
	private PokemonState pokemonState;

	public Charmander() {
		pokemonState = CharmanderStartLv.getInstance();
	}

	protected void changeState(PokemonState ps){
		pokemonState = ps;
	}

	void whoAreYou() {
		pokemonState.whoAreYou(this);

	}

	void whatYouCanDo() {
		pokemonState.whatYouCanDo(this);
	}

	void evolution() {
		pokemonState.evolution(this);
	}
}
