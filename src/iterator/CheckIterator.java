/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vld
 */
public class CheckIterator extends Thread{

	static int ind = 1;
	ArrayList names = new ArrayList();

	/*
	a) Molemmilla on oma iterattori
	Testi palauttaa:
	Exception in thread "Thread-0" java.util.ConcurrentModificationException
	*/

	//Iterator it = names.iterator();

	public CheckIterator() {
		for (int i=0; i<1000; i++){
			names.add("Steve" + ind);
			names.add("Jack" + ind);
			names.add("Tom" + ind);
			names.add("Henry" + ind);
			names.add("Karl" + ind);

			/*
			d) Lisätään listaan int tyypinen data
			Ohjelma palauttaa virhe
			*/
			names.add(new Integer (5));
		}
		ind++;
	}



	public void run(){

	/*
	b) Samaa iteraattoria vuorotellen
	
	Ohjelma pyörittää ilman virheitä
		
	*/	

	Iterator it = names.iterator();
		while(it.hasNext()){
			String obj = (String) it.next();
			System.out.println(obj);

			/*
			c) Muutoksia tilanteessa ohjelma palauttaa virhe*/

			//names.add("Sussi");
			//names.remove(200);

		}
		
	}

	public static void main(String[] args) {
		
		CheckIterator check = new CheckIterator();
		CheckIterator anotherCheck = new CheckIterator();

		check.start();
		anotherCheck.start();
	}
	
}
