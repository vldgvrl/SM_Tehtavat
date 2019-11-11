/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author vld
 */
class Write implements Data{

	private Data data;
	private String message;

	Write(Data nameData) {
		this.data = nameData;
	}

	public void readTheFile() {
		data.readTheFile();
	}

	public String writeTheFile() {
		writeData();
		return data.writeTheFile() + message; 
	}
	
	public void writeData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("To enable WRITE rights");
		System.out.println("Enter the password");
		String userPaswd = scanner.next();
		if ("1234".equals(userPaswd)){
			System.out.println("Now you have also WRITE rights");
			message = " and WRITE rights";
		}else{
			System.out.println("Password is incorrect");
			message = " You are not able to write";
		}
		
	}
	
}
