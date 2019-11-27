/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author vld
 */
public class Hardware implements ServiceOperations{

	String serviceName;

	Hardware(String service) {
		this.serviceName = service; 
	}

	@Override
	public void build() {
		System.out.println(serviceName + " on tilattu ja se on palvelussa");
	}

	@Override
	public void execute() {
		System.out.println(serviceName + " on toteutettu");
	}
	
}
