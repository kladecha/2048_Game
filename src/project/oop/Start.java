package project.oop;

import javax.swing.JFrame;

import java.awt.Toolkit;

public class Start {
	
	public static void main(String[] args) {
		Game game = new Game();
		
		JFrame window = new JFrame("2048");
		window.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\somjit\\eclipse-workspace\\2048\\src\\project\\oop\\2048_logo.png"));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.add(game);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		game.start();
	}
}
