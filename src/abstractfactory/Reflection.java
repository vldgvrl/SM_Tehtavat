/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vld
 */
public class Reflection {


	public static void main(String[] args) {

		MyClothes student = new MyClothes(new Adidas());
		student.tellWhatWear();

		String newClothes = "abstractfactory.Boss";

		try {

			Shop clothes = (Shop) Class.forName(newClothes).newInstance();
			student.buyClothes(clothes);

		} catch (Exception ex) {
			System.out.println(ex);

		}
		student.tellWhatWear();
	}


}
	
	
	
