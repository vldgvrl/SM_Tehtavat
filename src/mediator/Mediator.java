/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;

/**
 *
 * @author vld
 */
public class Mediator {
	
	int hyppynMaara=2;
	double hyppynPituus;
	int mitattuPituus;
	int[] arvot;
	float kokoArvo;

	ArrayList<Hyppaaja> hyppaajaList = new ArrayList<Hyppaaja>();
	Mittamies  mittamies; 
	Arvostelutuomarit arvostelut; 
	Kisasihteeri kisasihteeri;
	Tulosrivi tulosRivi;
	Tulostaulu taulu;

	public Mediator() {
		new Hyppy(hyppynMaara);
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));
		hyppaajaList.add(new Hyppy("nimi", 1));


		mittamies = new Mittamies();
		arvostelut = new Arvostelutuomarit(5);
		kisasihteeri = new Kisasihteeri();
		taulu = new Tulostaulu();
	}

	public void startKilpailu(){
		int count=1;
		for (Hyppaaja h : hyppaajaList){
			System.out.println(count + " hyppääjä: " + h.annaNimiJaNumero());
			count++;
			for (int i=0; i<hyppynMaara; i++){
				h.hyppaa();
				hyppynPituus = h.getPituus();
				mitattuPituus = mittamies.mittaa(hyppynPituus);
				arvot = arvostelut.arvostaa(mitattuPituus, h.getTyylipisteet());
				kokoArvo = kisasihteeri.yhteensa(arvot);
				tulosRivi = new Tulosrivi(h.annaNimiJaNumero(), arvot);
				tulosRivi.setYhteensa(kokoArvo);
				System.out.println(tulosRivi.tulos());
				taulu.lisaaTauluun(tulosRivi);

			}

		}

		taulu.naytaaTaulu();

	}
	


}
