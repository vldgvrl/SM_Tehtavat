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
public class WallButton {

	Command cmd;

	public WallButton(Command cmd) {
		this.cmd = cmd;
	}

	public void push() {
		cmd.execute();
	}
	
}
