/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vld
 */
//AbstractFactory luokka

public class MyClothes {

	private Shop myClothes;

	public MyClothes(Shop clothes) {

		this.myClothes = clothes;
	}


	public void tellWhatWear(){
		
		System.out.println("Minulla on päällä:");

		System.out.println(myClothes.getBoot()+"\n"+
		myClothes.getJeans()+"\n"+
		myClothes.getTShirt()+"\n"+
		myClothes.getCap());

	}

	public void buyClothes(Shop clothes){
		this.myClothes = clothes;
	}

}
