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
public class Software implements ServiceOperations {

	String serviseName;
	
	Software(String service) {
		serviseName = service;
	}

	@Override
	public void build() {
		System.out.println(serviseName + " on tilattu ja se on toteutuksessa...");
	}

	@Override
	public void execute() {
		System.out.println(serviseName + " on valmis julkaisuun!");
	}
	
}
