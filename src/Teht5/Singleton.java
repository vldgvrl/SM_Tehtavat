/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teht5;

/**
 *
 * @author vld
 */
public class Singleton {
	
	private Singleton(){
		props = new Properties() {};
	};

	private static Singleton INSTANCE = null;

	private Properties props = null;

	public static Singleton getInstance(){
		
		if (INSTANCE == null){
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	public synchronized Properties addProperties(String device){
		if (device == "computer"){
			props = new Computer("Properties from my ThinkPad computer");
			return props;
		}else if (device == "phone"){
			props = new Phone("Properties from my IPhone");
			return props;
		}
		return null;
	}

	public void show(){
		System.out.println(props);
	}



}
