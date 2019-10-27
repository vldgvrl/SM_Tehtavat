/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 */
public class Main {

	public static void main (String args[]){

		//Avataa vaatekaappi
		Cabinet cabinet = new Cabinet();
		
		//Pukeutua Adidas vaateitaadidas
		System.out.println("Opiskeluaikana pukeutunut "
			+ "Adidas-merkkisiin vaatteisiin. Minulla oli:");
		cabinet.wearToSchool();

		//Pukeutua Boss vaateita
		System.out.println("Minulla on nyt päällään:");
		cabinet.tellWhatOnMe();
	
	}
}
