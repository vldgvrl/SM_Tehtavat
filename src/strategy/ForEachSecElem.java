/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author vld
 */
public class ForEachSecElem implements ListConverter{

	Object [] table;
	String returnStringList = "";

	@Override
	public String toString(List list) {

		table = new Object[list.size()];

		for (int i=0; i<table.length; i++){
			table[i] = list.get(i);
		}

		for (int i=0; i<table.length; i++){
			if(i%2!=0){
				returnStringList += (table[i].toString() + '\n');
			}else {
				returnStringList += table[i].toString(); 

			}
		}

		return returnStringList;
	}
}
