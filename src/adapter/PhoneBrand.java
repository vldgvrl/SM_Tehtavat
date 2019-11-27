/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author vld
 */
public abstract class PhoneBrand {

	String phoneBrand;
	String [] exceptedBrands = {"Nolia", "Samsung", "Honor", "Huawei", "Xiomi"};

	public String checkBrand(String phoneName){
		for (int i=0; i<exceptedBrands.length; i++){
			if (phoneName != exceptedBrands[i]){
				phoneBrand = ", but they can not be applied, because your model is not support this feature. Try to make them again from another device.";
			}else{
				phoneBrand = "";
			}

		}
		return phoneBrand;
	}
	
}
