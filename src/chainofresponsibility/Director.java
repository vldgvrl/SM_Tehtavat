/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author vld
 */
class Director extends IncreaseSalary {

	public void processRequest(IncreaseSalaryRequest request) {

		System.out.println("Sinun palkankorotuspyyntö "
			+ request.getNewSalary() + " € oli lähetetty"
				+ " toimitusjohtajalle");
	}
}
