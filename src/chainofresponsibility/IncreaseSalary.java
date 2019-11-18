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
abstract class IncreaseSalary {

	protected IncreaseSalary successor;
	protected double difference; 

	public void setSuccessor(IncreaseSalary successor) {
		this.successor = successor;
	}

	abstract public void processRequest(IncreaseSalaryRequest request);
}
