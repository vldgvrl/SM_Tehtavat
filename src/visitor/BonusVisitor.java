/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import state.*;

/**
 *Testaus main luokka on state pakkauksessa:
 * <a href="https://github.com/vldgvrl/SM_Tehtavat/blob/master/src/state/Main.java">state Main.java</a>
 * 
 * @author vld
 */
public class BonusVisitor implements Visitor{

	private int charBonus;
	private int bulbBonus;
	private int pikaBonus;

	@Override
	public void visit(Charmander pokemon) {
		charBonus += 20;
		System.out.println("Charmander points are: " + charBonus);
		//charmander.addBonusPoints(20);
		//System.out.println("Your pokemon has "
		//	+ charmander.getBonusPoints() + " points.");

	}

	@Override
	public void visit(Pikachu pokemon) {
		pikaBonus += 10;
		System.out.println("Pikachu points are: " + pikaBonus);
	}

	@Override
	public void visit(Bulbozavr pokemon) {
		bulbBonus += 30;
		System.out.println("Bulbozavr points are: " + bulbBonus);
	}


}
