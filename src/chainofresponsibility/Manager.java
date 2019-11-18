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
class Manager extends IncreaseSalary {
		
	private static final double ALLOWED = 0.02;

	public void processRequest(IncreaseSalaryRequest request) {

		super.difference = request.getNewSalary() - request.getActualSalary();

		if (difference <= request.getActualSalary() * ALLOWED) {
			System.out.println("Sinun palkankorotuspyyntö "
				+ request.getNewSalary() + " € oli lähetetty"
					+ " lähiesimiehelle");
		} else if (successor != null) {
			successor.processRequest(request);
		}
		System.out.println("Lähimies voi hyväksyä maksimisaan: " + request.getActualSalary() * ALLOWED + "€" );
	}
}	
