/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *Ohjelman käyttävä abstraktio on ComputerServise luokka 
 * ja sen alitoteutuksia: Programm, Specialist tai joku muu palvelu. 
 * 
 * Aliluokan metodia voi olla esimerkiksi: antaa palvelu 'provideService()',
 * saada maksu 'getPay()'.*
 */
public abstract class ComputerService {

	protected ServiceOperations serviceList;

	protected ComputerService(ServiceOperations serviceList){
		this.serviceList = serviceList;
	}

	abstract void provideService();
	abstract void getPay();
	
}
