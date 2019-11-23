/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import state.*;

/**
 *
 * @author vld
 */
public interface Visitor {

	void visit(Charmander pokemon);
	void visit(Pikachu pokemon);
	void visit(Bulbozavr pokemon);

}
