package main;


import window.MainFrame;

public class Controller {
	
	public Controller() {
		Player player = new Player();
		System.out.println("Generate frame");
		
		// Main-Frame
		MainFrame frame = new MainFrame(player);
		frame.setVisible(true);
	}
}
