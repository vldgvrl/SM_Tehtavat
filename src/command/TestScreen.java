/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author vld
 */
public class TestScreen {
	public static void main(String[] args) {
		Screen screen = new Screen();
		Command switchUp = new FlipUpCommand(screen);
		Command switchDown = new FlipDownCommand(screen);
		WallButton button1 = new WallButton(switchUp);
		WallButton button2 = new WallButton(switchDown);
		button1.push();
		button2.push();
	}
	
}
