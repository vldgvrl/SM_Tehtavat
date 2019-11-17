/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vld
 */
public class ForEachElem implements ListConverter{


	@Override
	public String toString(List list) {

		String returnStringList = "";
		Iterator<String> iter = list.iterator();

		while (iter.hasNext()){

			returnStringList += iter.next() + '\n';
			
		}
		
		return returnStringList;
	}
}
