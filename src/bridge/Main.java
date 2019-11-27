/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *Tässä luokassa märitellään mitkä palveluita toteutetaan, 
 * mitkä ovat jo toteutettu ja mitkä on myyty.
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		//Luodan uusi työntekijä, antaa palvelu ja lähettää lasku
		ComputerService specialist = new Specialist(new Hardware("Käyttöjärjestelmän asennus"));
		specialist.provideService();
		specialist.getPay();

		//Luodan uusi tuote, myydä se ja lähettää lasku
		ComputerService programm = new Programm(new Software("Fitness ohjelma")); 
		programm.provideService();
		programm.getPay();

		//Luodan uusi ohjelmistokehittäja työntekijä
		ComputerService webDevelper = new Specialist(new Software("Nettisivun design päivitys")); 
		webDevelper.provideService();
		webDevelper.getPay();
			
	}
	
}
