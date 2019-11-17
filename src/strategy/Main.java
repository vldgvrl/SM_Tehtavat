/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vld
 */
public class Main {

	public static void main(String[] args) {

		List employee = new ArrayList<String>();

		employee.add("Nancy");
		employee.add("Davolio");
		employee.add("12/8/1968");
		employee.add("Andrew");
		employee.add("Fuller");
		employee.add("2/19/1952");
		employee.add("Janet");
		employee.add("Leverling");
		employee.add("8/30/1963");
		
		System.out.println("====New line for each row====");
		ListConverter list = new ForEachElem(); 
		System.out.println(list.toString(employee));

		System.out.println("====New line for each second row====");
		ListConverter eachSecondLine = new ForEachSecElem();
		System.out.println(eachSecondLine.toString(employee));

		System.out.println("====New line for each third row====");
		ListConverter eachThirdLine = new ForEachThirdElem();
		System.out.println(eachThirdLine.toString(employee));

	}
	
}
