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
public class Main {

	public static void main(String[] args) {

		Data file = new ReadOnly();
		file.readTheFile();
		System.out.println(file.writeTheFile());
		
		Data fileEdit = new Write(new ReadOnly());
		fileEdit.readTheFile();
		System.out.println(fileEdit.writeTheFile());
		
		

		
		
	}
	
}
