/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author vld
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Enter text >");
		EventSource eventSource = new EventSource();
		eventSource.addObserver(new Observer(){
			public void update(Observable o, Object arg) {
				System.out.println("Received response. Enter text > ");
			}
		});
			
		new Thread(eventSource).start();
		
	}
	
}
