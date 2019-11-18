/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vld
 */
class CheckAuthority {

	public static void main(String[] args) {
		Manager manager = new Manager();
		HeadOfUnit headOfUnit = new HeadOfUnit();
		Director director= new Director();
		manager.setSuccessor(headOfUnit);
		headOfUnit.setSuccessor(director);

		try {
			while (true) {
				System.out.println("Anna nykyinen työpalkka:");
				System.out.print(">");
				double as = Double.parseDouble(new BufferedReader(new
					InputStreamReader(System.in)).readLine());
				
				System.out.println("Anna uuden palkkatoive:");
				System.out.print(">");
				double ns = Double.parseDouble(new BufferedReader(new
					InputStreamReader(System.in)).readLine());
					manager.processRequest(new IncreaseSalaryRequest(as, ns, "Lisätty uudet tehtävät"));
			}
		} catch(Exception e) {
			System.exit(1);
		}
	}
}