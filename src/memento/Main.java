/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author vld
 */
public class Main {

	public static void main(String[] args) {

		Client [] clients = new Client[10]; 
		for (int i=0; i<clients.length; i++){
			clients[i] = new Client();
		}

		for (int i=0; i<clients.length; i++){
			clients[i].start();
		}

	}
	
}
