/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author vld
 */
public class ReadOnly implements Data {
	
	public void readTheFile() {
		System.out.println("You can only read a file");
		System.out.println("Here is the file text");
	}

	public String writeTheFile() {
		return "Read rights";
	}

	
}
