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
public class ForEachThirdElem implements ListConverter{

	String returnStringList = "";
	int count = 1;

	@Override
	public String toString(List list) {

		for (int i=0; i<list.size(); i++){
			if(count==3){
				returnStringList += list.get(i).toString() + '\n';
				count = 0;
			}else{
				returnStringList += list.get(i).toString();
			}
			count ++;
		}

		return returnStringList;
	}



	
}
