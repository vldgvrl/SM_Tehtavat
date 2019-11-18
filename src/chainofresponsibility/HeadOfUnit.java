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
class HeadOfUnit extends IncreaseSalary {

	private final double ALLOWED = 0.05;

	public void processRequest(IncreaseSalaryRequest request) {
		
		super.difference = request.getNewSalary() - request.getActualSalary();

		if (difference <= request.getActualSalary() * ALLOWED) {
			System.out.println("Sinun palkankorotuspyyntö "
				+ request.getNewSalary() + " € oli lähetetty"
					+ " yksikön päällikölle");
		} else if (successor != null) {
			successor.processRequest(request);
		}
		System.out.println("Yksikön päällikkö voi hyväksyä maksimisaan: " + request.getActualSalary() * ALLOWED + "€" );
	}
}
