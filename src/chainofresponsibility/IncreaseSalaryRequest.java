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
class IncreaseSalaryRequest {

	private double actualSalary;
	private double newSalary;
	private String reason;

	public IncreaseSalaryRequest(double actualSalary, double newSalary, String reason) {
		this.actualSalary = actualSalary;
		this.newSalary = newSalary;
		this.reason = reason;
	}

	public double getActualSalary() {
		return actualSalary;
	}

	public double getNewSalary() {
		return newSalary;
	}

	public void setActualSalary(double actualSalary) {
		this.actualSalary = actualSalary;
	}

	public void setNewSalary(double newSalary) {
		this.newSalary = newSalary;
	}


	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}