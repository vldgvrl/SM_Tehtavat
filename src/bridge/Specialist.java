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
public class Specialist extends ComputerService {

	public Specialist(ServiceOperations serviceList) {
		super(serviceList);
	}

	@Override
	void provideService() {
		System.out.println("Ammattitaitoinen työntekijä antaa teille paras palvelu");
		serviceList.build();
		serviceList.execute();
	}

	@Override
	void getPay() {
		System.out.println("******** Yhdessä: 40€ *******");
	}

	
}
