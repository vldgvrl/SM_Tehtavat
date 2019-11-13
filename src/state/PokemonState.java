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
public abstract class PokemonState {

	void whoAreYou(Charmander pokemon){}
	void whatYouCanDo(Charmander pokemon){}
	void changeState(Charmander pokemon, PokemonState pokemonState){
		pokemon.changeState(pokemonState);
	}
	void evolution(Charmander pokemon) {}

}
