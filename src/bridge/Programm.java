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
public class Programm extends ComputerService {

	public Programm(ServiceOperations serviceList) {
		super(serviceList);
	}


	@Override
	void provideService() {
		serviceList.build();
		serviceList.execute();
		System.out.println("Tääsa on linkki http://link.com josta voitte ladata ohjelmasi");
	}

	@Override
	void getPay() {
		System.out.println("****** Yhdessä: 250 € *******");
	}
	
}
