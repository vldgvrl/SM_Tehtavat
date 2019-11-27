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
public class Settings {
	
	private Settings(){
		props = new Properties() {};
	};

	private static Settings INSTANCE = null;

	private Properties props = null;

	public static Settings getInstance(){
		
		if (INSTANCE == null){
			INSTANCE = new Settings();
		}
		return INSTANCE;
	}

	public synchronized Properties addProperties(String device){
		if (device == "computer"){
			props = new Computer("Properties was made on " + device);
			return props;
		}else if (device == "phone"){
			props = new Phone("Properties was made on your " + device);
			return props;
		}
		return null;
	}

	public void show(){
		System.out.println(props);
	}



}
